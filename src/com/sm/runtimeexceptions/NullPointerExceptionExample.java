package com.sm.runtimeexceptions;

/**
 * 
 * NullPointerException is example for RunTimeException.
 *
 */
public class NullPointerExceptionExample {
	public static void main(String[] args) {
		System.out.println("Program Started");
		String name = null;
		try {
			System.out.println(name.toString());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Program ended");
		}
	}
}
