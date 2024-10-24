package com.sm.runtimeexceptions;

/**
 * ArithmeticException is the example for RunTimeException it throws an
 * ArithmeticException at RunTime.
 * we have surround the critical line of with try and catch block.
 * finally block will execute every time even throws an exception.
 */
public class ArithmeticExceptionExamples {
	public static void main(String[] args) {
		System.out.println("Program started");
		try {
			int x = 10;
			System.out.println(x / 0);// critical line of code
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Program Ended");
		}
	}
}