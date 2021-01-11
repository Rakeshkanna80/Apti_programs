package com.xworkz.java.StringPractice;

public class ReverseString {
	public static void main(String[] args) {
		String s="Entertainment";
		char[] revStr=s.toCharArray();
		System.out.println("Before reverse the string: ");
		for(int i=0;i<revStr.length;i++) 
			System.out.print(revStr[i]);
			
		System.out.println("\nAfter reverse the string: ");
		for(int i=revStr.length-1;i>=0;i--) 
			System.out.print(revStr[i]);
 	}
}
