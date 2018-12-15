package com;

public class JMSService implements BusinessService{

	@Override
	public void doProcessing() {
		// TODO Auto-generated method stub
		System.out.println("processing task by invoking JMS Service");
	}
	public String toString() {
		return "JMS Service Object";
	}
}
