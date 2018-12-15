package com;

import java.util.ArrayList;
import java.util.List;

public class Cache {
private static List<Service> services;
public Cache(){
	services = new ArrayList<>();
}
public Service getService(String serviceName){
	System.out.println("Number of Services "+services.size());
	for(Service service: services){
		if(service.getName().equalsIgnoreCase(serviceName)){
			System.out.println("Return Cache "+serviceName+":Object");
			return service;
		}
		
	}
	return null;
}
public void addService(Service newService){
	boolean exists = false;
	for(Service service:services){
		if(service.getName().equalsIgnoreCase(newService.getName())) {
			exists= true;
			System.out.println("Service is not available");
		}
	}
		if(!exists){
			System.out.println("Service Added...");
			services.add(newService);
		}
	
}
}
