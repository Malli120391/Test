package com.javacodes.test;

public class StringTest {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String(s1);
		System.out.println("s1==s2 ? " + (s1==s2) + " & " + "s1 == s3 ? " 
		+ (s1==s3) + " & " + "s1 equals s3 ?" + (s1.equals(s3)));
	}

}
