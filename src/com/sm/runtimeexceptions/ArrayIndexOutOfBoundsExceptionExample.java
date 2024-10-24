package com.sm.runtimeexceptions;
/**
 * 
 *ArrayIndexOutOfBoundsException is example for RunTimeException.
 *
 */
public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		System.out.println("program Started");
		int[] array= new int[3];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		try {
//			 we can't add the value at index 3 because length is 3 so we can store the values up to index 2. 
			array[3] = 40;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Program ended");
		}
	}
}
