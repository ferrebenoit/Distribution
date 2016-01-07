package org.distribution.rest.repository;

import java.util.ArrayList;

import org.distribution.Action;
import org.springframework.hateoas.PagedResources;

public class ActionPagedResources  extends PagedResources<Action> {

	public ActionPagedResources() {
		super(new ArrayList<Action>(), null);
	}

}
