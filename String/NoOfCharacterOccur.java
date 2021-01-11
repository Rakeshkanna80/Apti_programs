package com.xworkz.java.StringPractice;

public class NoOfCharacterOccur {
	static void noOfCharacterOccur(String s,char c) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c)
				count++;
		}
		System.out.println(c+" Occured at: "+count+ " times");
	}
	public static void main(String[] args) {
		String s="transformer";
		char c='r';
		noOfCharacterOccur(s,c);
	}
}
