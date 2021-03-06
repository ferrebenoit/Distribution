/**
 * 
 */
package org.distribution;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author ben
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract public class Action {
	
	private long id;
	
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
