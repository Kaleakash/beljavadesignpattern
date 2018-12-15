package com;

public class Dispatcher {
	private UserView userView;
	private AccountView accountView;
	public Dispatcher(){
		userView = new UserView();
		accountView = new AccountView();
	}
	public void dispatch(String req){
		if(req.equalsIgnoreCase("user")){
			userView.show();
		}else if(req.equalsIgnoreCase("account")){
			accountView.show();
		}else {
			System.out.println("Invalid View Page");
		}
	}
}
