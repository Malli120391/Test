package com.javacodes.test;

public class StringTest2 {

	public static void main(String[] args) {

		String s1 = "abc";
		
		String s2 = new String(s1);
		System.out.println((s1==s2) + " " + (s1.equals(s2)));
	}

}
