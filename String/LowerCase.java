package com.xworkz.java.StringPractice;

public class LowerCase {
	public static void main(String[] args) {
		String s="Hello Welcome To java Programming";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=65 && ch[i]<=90)
				ch[i]=(char)((int)ch[i]+32);
		}
		System.out.println(ch);
	}
}
