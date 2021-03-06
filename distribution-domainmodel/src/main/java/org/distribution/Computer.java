package org.distribution;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author ben
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Computer {

	private long id;
	
	private String name;
	private String macAddress;
	
	private Set<Installation> installations;
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the macAddress
	 */
	public String getMacAddress() {
		return macAddress;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * @return the installations
	 */
	public Set<Installation> getInstallations() {
		return installations;
	}
	
	
}
