/**
 * 
 */
package org.distribution.jpa.repository;

import org.distribution.jpa.entity.Installation;
import org.distribution.repository.jdbc.RepositoryJDBC;

/**
 * @author ben
 *
 */
public interface InstallationRepository extends RepositoryJDBC<Installation, Long> {

	//List<Application> findByName(@Param("name") String Name);
}
