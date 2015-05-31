package org.distribution.rest.repository;

import java.util.ArrayList;

import org.distribution.Command;
import org.springframework.hateoas.PagedResources;

public class CommandPagedResources  extends PagedResources<Command> {

	public CommandPagedResources() {
		super(new ArrayList<Command>(), null);
	}

}
