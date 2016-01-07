/**
 * 
 */
package org.distribution;

/**
 * @author ben
 *
 */
public class ActionResult {

	private boolean success;
	private String shortMessage;
	private String longMessage;
	
	/**
	 * @param success
	 * @param shortMessage
	 * @param longMessage
	 */
	public ActionResult(boolean success, String shortMessage, String longMessage) {
		super();
		this.success = success;
		this.shortMessage = shortMessage;
		this.longMessage = longMessage;
	}
	
	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}
	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}
	/**
	 * @return the shortMessage
	 */
	public String getShortMessage() {
		return shortMessage;
	}
	/**
	 * @param shortMessage the shortMessage to set
	 */
	public void setShortMessage(String shortMessage) {
		this.shortMessage = shortMessage;
	}
	/**
	 * @return the longMessage
	 */
	public String getLongMessage() {
		return longMessage;
	}
	/**
	 * @param longMessage the longMessage to set
	 */
	public void setLongMessage(String longMessage) {
		this.longMessage = longMessage;
	}
	
	
}
