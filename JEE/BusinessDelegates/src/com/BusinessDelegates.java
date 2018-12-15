package com;

public class BusinessDelegates {
	private BusinessLookup lookupService = new BusinessLookup();
	private BusinessService businessService;
	public void doTask(String serviceType) {
		businessService = lookupService.getBusinessService(serviceType);
		System.out.println(businessService.toString()+":Got the Business server object");
		businessService.doProcessing();
	}
}
