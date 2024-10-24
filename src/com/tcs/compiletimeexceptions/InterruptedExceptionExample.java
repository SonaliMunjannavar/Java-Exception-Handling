package com.tcs.compiletimeexceptions;

/**
 * 
 *CompileTimeException will throws an exception at compile time only.
 *we have to handle the exception with try and catch before compile the code.
 *Examples :-
 *	1)InterruptedException
 *
 */
public class InterruptedExceptionExample {
	public static void lunchUpdate(String name) {
		System.out.println(name+" Started his Lunch");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(name+" Finished his Lunch");
	}
	public static void main(String[] args) {
		InterruptedExceptionExample.lunchUpdate("Pavan Kalyan");
	}
}
