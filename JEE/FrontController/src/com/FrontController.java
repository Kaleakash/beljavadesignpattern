package com;

public class FrontController {
private Dispatcher dispatcher;
public FrontController() {
	dispatcher = new Dispatcher();
}
private boolean isAuthenticUser() {
	System.out.println("User Authentication Done here");
	return true;
}
private void trackRequest(String req){
	System.out.println("Page requested "+req);
}
public void dispatchRequest(String req){
	trackRequest(req);
	if(isAuthenticUser()){
		dispatcher.dispatch(req);
	}
}
}
