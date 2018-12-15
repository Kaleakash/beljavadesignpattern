package com;

public class EJBService implements BusinessService {

	@Override
	public void doProcessing() {
		// TODO Auto-generated method stub
		System.out.println("processing task by invoking EJB Service");
	}
	public String toString() {
		return "EJB Service Object";
	}
}
