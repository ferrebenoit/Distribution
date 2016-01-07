package org.distribution.action;

import org.distribution.Action;
import org.distribution.ActionResult;


public class Command extends Action {
	private String executablePath;
	private String Args;
	

	/**
	 * @return the executablePath
	 */
	public String getExecutablePath() {
		return executablePath;
	}
	/**
	 * @return the args
	 */
	public String getArgs() {
		return Args;
	}
	@Override
	public ActionResult doIt() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ActionResult update() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ActionResult revert() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
