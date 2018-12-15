package com;

public class DebugFilter implements Filter {
	   public void execute(String request){
	      System.out.println("Degger request: " + request);
	   }
}
