package org.distribution.client;

//import org.apache.commons.exec.CommandLine;
import org.distribution.Application;
import org.distribution.Computer;
import org.distribution.rest.repository.ApplicationPagedResources;
import org.distribution.rest.repository.ApplicationRestRepository;
import org.distribution.rest.repository.ComputerPagedResources;
import org.distribution.rest.repository.ComputerRestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class Appc {

	@Autowired
	private ApplicationRestRepository applicationRestRepository;
	@Autowired
	private ComputerRestRepository computerRestRepository;
	
	public Appc() {}

	public void runTest() {
		//CommandLine cmdLine = new CommandLine("executable");
		
		
		
		ApplicationPagedResources applicationPagedResources;
		
		applicationPagedResources = applicationRestRepository.getList();
		
		
    	System.out.println(applicationPagedResources.getContent().iterator().next().getClass());

       	for (Application application : applicationPagedResources.getContent()) {
    		System.out.println("ID      = " + application.getId());
    		System.out.println("Name    = " + application.getName());
    		System.out.println("Command = " + application.getInstallCommands());
    	}
    	
    	System.out.println("List Size   " + applicationPagedResources.getContent().size());
    	System.out.println("links Size  " + applicationPagedResources.getLinks().size());
    	System.out.println("totalelements Size  " + applicationPagedResources.getMetadata().getTotalElements());
 		
    	ComputerPagedResources computerPagedResources = computerRestRepository.getList();
    	
    	for (Computer computer : computerPagedResources.getContent()) {
    		System.out.println("ID     = " + computer.getId());
    		System.out.println("Name   = " + computer.getName());
    		System.out.println("Mac     = " + computer.getMacAddress());
    		
    	}

    	System.out.println("List Size   " + computerPagedResources.getContent().size());
    	System.out.println("links Size  " + computerPagedResources.getLinks().size());
    	System.out.println("totalelements Size  " + computerPagedResources.getMetadata().getTotalElements());
    	System.out.println("pages  " + computerPagedResources.getMetadata().getTotalPages());
	}
	
}
