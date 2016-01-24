/**
 * 
 */
package org.distribution.jpa.repository;

import org.distribution.jpa.entity.Computer;
import org.distribution.repository.jdbc.RepositoryJDBC;

/**
 * @author ben
 *
 */
public interface ComputerRepository extends RepositoryJDBC<Computer, Long> {

	//List<Command> findByType(@Param("type") String Name);
}
