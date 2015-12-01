/**
 * 
 */
package org.distribution.action;

/**
 * @author ben
 *
 */
abstract public class Action {
	private ActionType actionType;

	abstract public ActionResult doIt();
	abstract public ActionResult update();
	abstract public ActionResult revert();
	
	public ActionType getActionType() {
		return actionType;
	}
	
}
