package com;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrontController controller = new FrontController();
		controller.dispatchRequest("user");
		System.out.println("-------------");
		controller.dispatchRequest("account");
		System.out.println("----------------");
		controller.dispatchRequest("Abc");
	}

}
