package com;

public class Client {
public static void main(String[] args) {
	Service service = ServiceLocator.getService("EJBService");
	service.execute();
	
	service = ServiceLocator.getService("EJBService");
	service.execute();
	

}
}
