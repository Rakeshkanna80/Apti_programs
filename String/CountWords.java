package com.xworkz.java.StringPractice;

public class CountWords {
	static void countWords(String s) {
		int count=0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println("Total number of Words is: "+(count+1));
	}
	public static void main(String[] args) {
		String s="Welcome to xworkz";
		countWords(s);
	}
}
