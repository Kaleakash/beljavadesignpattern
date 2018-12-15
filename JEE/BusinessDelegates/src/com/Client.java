package com;

public class Client {
public static void main(String[] args) {
	BusinessDelegates businessDelegates = new BusinessDelegates();
	System.out.println("Invoke the business delegates by passing service type as EJB");
	businessDelegates.doTask("ejb");
	System.out.println("");
	System.out.println("Invoke the business delegates by passing service type as JMS");
	businessDelegates.doTask("jms");
}
}
