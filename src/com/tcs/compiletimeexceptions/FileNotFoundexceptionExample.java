package com.tcs.compiletimeexceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//FileNotFoundException is one of the example for the CompileTime Exception/Checked Exception.

public class FileNotFoundexceptionExample {
	
	public static void readFile(String pathName) {
		Scanner scanner =null;
		
		File file =new File(pathName);
		try {
			scanner =new Scanner(file);
			scanner.forEachRemaining(System.out::println);
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileNotFoundexceptionExample.readFile("No File");
		FileNotFoundexceptionExample.readFile("C:\\softwares\\javaworkspace\\exceptions\\src\\Names.txt");
	}

}
