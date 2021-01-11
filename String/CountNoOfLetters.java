package com.xworkz.java.StringPractice;

public class CountNoOfLetters {
	static void countLetters(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ')
				count++;
		}
		System.out.println("Total number of Character in "+s+" is: "+count);
	}
	public static void main(String[] args) {
		String s="transformer";
		countLetters(s);
	}
}
