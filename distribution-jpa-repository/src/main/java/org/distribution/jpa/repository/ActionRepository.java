/**
 * 
 */
package org.distribution.jpa.repository;

import org.distribution.Action;
import org.distribution.repository.jdbc.RepositoryJDBC;

/**
 * @author ben
 *
 */
public interface ActionRepository extends RepositoryJDBC<Action, Long> {

	//List<Command> findByType(@Param("type") String Name);
}
