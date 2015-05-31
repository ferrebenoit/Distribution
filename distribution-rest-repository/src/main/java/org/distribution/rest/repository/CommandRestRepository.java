package org.distribution.rest.repository;

import org.distribution.utils.rest.SpringDataRestRepositoryOperations;

public class CommandRestRepository extends SpringDataRestRepositoryOperations<CommandPagedResources> {

	public CommandRestRepository(boolean secure, String host, int port) {
		super(CommandPagedResources.class, secure, host, port, "command");
	}
	
}
