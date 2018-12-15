package com;

public class BusinessLookup {

	BusinessService getBusinessService(String serviceType){
		if(serviceType.equalsIgnoreCase("ejb")){
			return new EJBService();
		}else if(serviceType.equalsIgnoreCase("jms")){
			return new JMSService();
		}else {
			return null;
		}
	}
}
