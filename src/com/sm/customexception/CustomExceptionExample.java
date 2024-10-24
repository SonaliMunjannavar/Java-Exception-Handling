package com.sm.customexception;

/**
 * 
 *CustomException is User Defined Exception.
 *
 */
class CustomException extends Throwable{
	private String message;

	public CustomException(String message) {
		super(message);
	}
}

class Election {
	public void rightToVote(int age) throws CustomException{
		if(age<18)
			throw new CustomException("You are Not eligible to caste your Vote");
		else 
			System.out.println("Pls Caste Your Vote");
	}
}
public class CustomExceptionExample {
	public static void main(String[] args) {
		Election election=new Election();
		try {
			election.rightToVote(25);
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}
	}
}
