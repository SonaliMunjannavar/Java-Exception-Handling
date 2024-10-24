package com.sm.runtimeexceptions;

public class RunTimeExceptionExample {
	public static void main(String[] args) {
//		small Example for RuTimeException
//		we can't divisible any number with zero but if you seen below line of code syntactically correct it doesn't give any exception at compile time but it throws an exception at runtime.
		System.out.println(10/0);
	}
}