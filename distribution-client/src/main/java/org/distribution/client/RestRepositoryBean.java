package org.distribution.client;

import javax.validation.constraints.NotNull;

import org.distribution.rest.repository.ApplicationRestRepository;
import org.distribution.rest.repository.CommandRestRepository;
import org.distribution.rest.repository.ComputerRestRepository;
import org.distribution.rest.repository.InstallationRestRepository;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ConfigurationProperties(locations = "classpath:mail.properties", ignoreUnknownFields = false, prefix = "mail")
@ConfigurationProperties(prefix = "rest")
public class RestRepositoryBean {

	
	@NotNull
	private String host = "localhost";
	private int port = 8080;
	private boolean securedConnexion = false;
	
	public RestRepositoryBean() {}

	@Bean
	public ApplicationRestRepository applicationRepository() {
		return new ApplicationRestRepository(securedConnexion, host, port);
	}
	
	@Bean
	public CommandRestRepository commandRepository() {
		return new CommandRestRepository(securedConnexion, host, port);
	}
	
	@Bean
	public ComputerRestRepository computerRepository() {
		return new ComputerRestRepository(securedConnexion, host, port);
	}
	
	@Bean
	public InstallationRestRepository installationRepository() {
		return new InstallationRestRepository(securedConnexion, host, port);
	}

	public boolean isSecuredConnexion() {
		return securedConnexion;
	}

	public void setSecuredConnexion(boolean securedConnexion) {
		this.securedConnexion = securedConnexion;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
}
