package org.distribution.rest.repository;

import org.distribution.utils.rest.SpringDataRestRepositoryOperations;

public class ActionRestRepository extends SpringDataRestRepositoryOperations<ActionPagedResources> {

	public ActionRestRepository(boolean secure, String host, int port) {
		super(ActionPagedResources.class, secure, host, port, "command");
	}
	
}
