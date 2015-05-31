package org.distribution.rest.repository;

import org.distribution.utils.rest.SpringDataRestRepositoryOperations;

public class InstallationRestRepository  extends SpringDataRestRepositoryOperations<InstallationPagedResources> {

	public InstallationRestRepository(boolean secure, String host, int port) {
		super(InstallationPagedResources.class, secure, host, port, "installation");
	}

}
