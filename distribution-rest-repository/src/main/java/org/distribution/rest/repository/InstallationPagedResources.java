package org.distribution.rest.repository;

import java.util.ArrayList;

import org.distribution.Installation;
import org.springframework.hateoas.PagedResources;

public class InstallationPagedResources extends PagedResources<Installation> {

	public InstallationPagedResources() {
		super(new ArrayList<Installation>(), null);
	}
}
