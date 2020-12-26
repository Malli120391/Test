package com.javacodes.test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException {

	public static void main(String[] args) throws FileNotFoundException  {
 
		try {
		testException();
		}catch(IOException e) {
			 e.printStackTrace();
		}
	}
	public static void testException() throws IOException, FileNotFoundException{
		System.out.println("Test");
	}

}
