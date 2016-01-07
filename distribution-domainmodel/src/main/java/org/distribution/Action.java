/**
 * 
 */
package org.distribution;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author ben
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
abstract public class Action {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Application application;
	
	private ActionType actionType;

	abstract public ActionResult doIt();
	abstract public ActionResult update();
	abstract public ActionResult revert();
	
	public ActionType getActionType() {
		return actionType;
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @return the application
	 */
	public Application getApplication() {
		return application;
	}
	
}
