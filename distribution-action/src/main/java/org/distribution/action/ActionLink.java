package org.distribution.action;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.distribution.Action;
import org.distribution.ActionResult;

public class ActionLink extends Action {

	private String path;
	private String name;
	private Path target;
	private Path workingDir;
	private Path icon;
	
		
	/**
	 * @param path
	 * @param target
	 * @param workingDir
	 * @param icon
	 */
	public ActionLink(String path, String name, Path target, Path workingDir,
			Path icon) {
		super();
		this.path = path;
		this.name = name;
		this.target = target;
		this.workingDir = workingDir;
		this.icon = icon;
	}
	
	@Override
	public ActionResult doIt() {
		try {Paths.get("first");
			// TODO test if link already exists
			Files.createSymbolicLink(linkPath(), target);
			return new ActionResult(true, "", "");
		} catch (IOException e) {
			return new ActionResult(false, e.getLocalizedMessage(), e.toString());
		}
		
	}


	@Override
	public ActionResult update() {
		// TODO test if link already exists
		return doIt();
	}


	@Override
	public ActionResult revert() {
		try {
			Files.delete(linkPath());
			return new ActionResult(true, "", "");
		} catch (IOException e) {
			return new ActionResult(false, e.getLocalizedMessage(), e.toString());
		}
	}
	
	private Path linkPath() {
		return Paths.get(path, name);
	}
	
	/**
	 * @return the link
	 */
	public String getPath() {
		return path;
	}
	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}
	/**
	 * @return the target
	 */
	public Path getTarget() {
		return target;
	}
	/**
	 * @param target the target to set
	 */
	public void setTarget(Path target) {
		this.target = target;
	}
	/**
	 * @return the workingDir
	 */
	public Path getWorkingDir() {
		return workingDir;
	}
	/**
	 * @param workingDir the workingDir to set
	 */
	public void setWorkingDir(Path workingDir) {
		this.workingDir = workingDir;
	}
	/**
	 * @return the icon
	 */
	public Path getIcon() {
		return icon;
	}
	/**
	 * @param icon the icon to set
	 */
	public void setIcon(Path icon) {
		this.icon = icon;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	
	
}
