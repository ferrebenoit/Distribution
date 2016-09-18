package org.distribution.vaadin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.util.StringUtils;
import org.vaadin.viritin.LazyList;
import org.vaadin.viritin.fields.MTable;

import com.vaadin.annotations.Theme;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

//import com.vaadin.vi

import org.distribution.jpa.entity.*;
import org.distribution.jpa.repository.ComputerRepository;

@SpringUI
@Theme("valo")
public class VaadinUI extends UI {

/**
	 * 
	 */
	private static final long serialVersionUID = -6466627415787104634L;

	private final ComputerEditor editor;

	private final ComputerRepository computerRepository;
	
	private final Grid grid;
	private final MTable<Computer> table;

	private final TextField filter;

	private final Button addNewBtn;

	@Autowired
	public VaadinUI(ComputerRepository computerRepository, ComputerEditor editor) {
		this.computerRepository = computerRepository;
		this.editor = editor;
		
		this.table = new MTable<>(Computer.class);
		this.grid = new Grid();
		this.filter = new TextField();
		this.addNewBtn = new Button("New computer", FontAwesome.PLUS);
	}

	@Override
	protected void init(VaadinRequest request) {
		// build layout
		HorizontalLayout actions = new HorizontalLayout(filter, addNewBtn);
		VerticalLayout mainLayout = new VerticalLayout(actions, table, editor);
		setContent(mainLayout);

		table.lazyLoadFrom(
				// entity fetching strategy
				(firstRow) -> computerRepository.findAll()
				, 
				// count fetching strategy
		        () -> (int) computerRepository.count(),
				45);
//		table.lazyLoadFrom(
//		        // entity fetching strategy
//		        (firstRow, asc, sortProperty) -> computerRepository.findAllBy(
//		                new PageRequest(
//		                        firstRow / PAGESIZE,
//		                        PAGESIZE,
//		                        asc ? Sort.Direction.ASC : Sort.Direction.DESC,
//		                        // fall back to id as "natural order"
//		                        sortProperty == null ? "id" : sortProperty
//		                )
//		        ),
//		        // count fetching strategy
//		        () -> (int) repo.count(),
//		        PAGESIZE
//		);
		
		// Configure layouts and components
		actions.setSpacing(true);
		mainLayout.setMargin(true);
		mainLayout.setSpacing(true);

		grid.setHeight(300, Unit.PIXELS);
		//grid.setColumns("id", "name", "macAddress");

		filter.setInputPrompt("Filter by computer name");

		// Hook logic to components

		// Replace listing with filtered content when user changes filter
		filter.addTextChangeListener(toto -> listComputers(toto.getText()));

		// Connect selected Customer to editor or hide if none is selected
		grid.addSelectionListener((e) -> {
			if (e.getSelected().isEmpty()) {
				editor.setVisible(false);
			}
			else {
				editor.editComputer((Computer) grid.getSelectedRow());
			}
		});

		// Instantiate and edit new Customer the new button is clicked
		addNewBtn.addClickListener(e -> editor.editComputer(new Computer()));

		// Listen changes made by the editor, refresh data from backend
		editor.setChangeHandler(() -> {
			editor.setVisible(false);
//			listComputers(filter.getValue());
			listComputers(null);
		});

		// Initialize listing
		listComputers(null);
	}

	// tag::listCustomers[]
	private void listComputers(String text) {
		if (StringUtils.isEmpty(text)) {
			grid.setContainerDataSource(
					new BeanItemContainer(Computer.class, computerRepository.findAll()));
		}
		else {
	//		grid.setContainerDataSource(new BeanItemContainer(Customer.class,
	//				repo.findByLastNameStartsWithIgnoreCase(text)));
		}
	}
	// end::listCustomers[]

}
