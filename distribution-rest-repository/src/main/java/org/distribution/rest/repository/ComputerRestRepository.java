package org.distribution.rest.repository;

import org.distribution.utils.rest.SpringDataRestRepositoryOperations;

public class ComputerRestRepository extends SpringDataRestRepositoryOperations<ComputerPagedResources> {

	public ComputerRestRepository(boolean secure, String host, int port) {
		super(ComputerPagedResources.class, secure, host, port, "computer");
	}

}
