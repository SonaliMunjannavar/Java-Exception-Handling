package com.tcs.compiletimeexceptions;
  //ClassNotFoundException is one of the example for Checked Exceptions.
public class ClassNotFoundExample {
	public static void findTheClass(String classPath) {
	try {
		Class className = Class.forName(classPath);
		boolean isTrue =className.equals(new ClassNotFoundExample());
		System.out.println(isTrue);
	}catch(ClassNotFoundException e){
		System.out.println(e.getMessage());
	}
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ClassNotFoundExample.findTheClass("com.tcs.exceptions.compiletimeexceptions.Student");//it throws ClassNotFoundException 
         ClassNotFoundExample.findTheClass("com.tcs.exceptions.compiletimeexceptions.ClassNotFoundExample");
	}

}
