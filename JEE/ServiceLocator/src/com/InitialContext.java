package com;

public class InitialContext {

	public Object lookup(String jndi) {

		if(jndi.equalsIgnoreCase("ejbservice")){
			System.out.println("Looking up and creating the new EJB Object");
			return new EJBService();
		}else if(jndi.equalsIgnoreCase("jmsservice")){
			System.out.println("Looking up and creating the new JMS Object");
			return new JMSService();
		}
		return null;
	}
}
