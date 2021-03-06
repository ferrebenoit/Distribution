package org.distribution;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author ben
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Application {
	
	private long id;
	
	private String name;
	private String version;
	
	private Set<Installation> installations;
	
	private Set<Action> Actions;

	private Application parent;
	
	private Set<Application> applicationDependencies;
	
	//private Set<Shortcut> Shortcuts;
	//private Set<Registry> regChanges;
	//private Set<FileCopy> fileCopies;
	//private Boolean isDelprofNeeded;
	//private HashMap<String, Parameter> parameters;

	//private URI SourceFiles;
	
	
	public Application() {
		super();
	}

	public Set<Application> getApplicationDependencies() {
		return applicationDependencies;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the installations
	 */
	public Set<Installation> getInstallations() {
		return installations;
	}

	/**
	 * @return the installCommands
	 */
	public Set<Action> getActions() {
		return Actions;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public Application getParent() {
		return parent;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

}
