package org.distribution.rest.repository;

import java.util.ArrayList;

import org.distribution.Computer;
import org.springframework.hateoas.PagedResources;

public class ComputerPagedResources extends PagedResources<Computer> {

	public ComputerPagedResources() {
		super(new ArrayList<Computer>(), null);
	}
}
