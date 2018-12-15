package com;

public class ServiceLocator {
private static Cache cache;
static {
	cache= new Cache();
}
public static Service getService(String jndiName){
	Service service = cache.getService(jndiName);

	if(service!=null){
		//System.out.println(service.getName());
		return service;
	}else {
	InitialContext context = new InitialContext();
	Service ser = (Service)context.lookup(jndiName);
	cache.addService(ser);
	System.out.println("Added...");
	return ser;
}
}
}
