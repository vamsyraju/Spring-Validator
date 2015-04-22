package com.tutorialpoint.spring.aspect;

public class Logging {
	
	   public void beforeAdv(){
	      System.out.println("Going to setup student profile.");
	   }

	  
	   public void afterAdv(){
	      System.out.println("Student profile has been setup.");
	   }

	  
	   public void afterReturningAdv(Object retVal){
	      System.out.println("Returning:" + retVal.toString() );
	   }

	 
	   public void afterThrowingAdv(IllegalArgumentException ex){
	      System.out.println("There has been an exception: " + ex.toString());   
	   }
}
