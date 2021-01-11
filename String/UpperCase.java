package com.xworkz.java.StringPractice;

public class UpperCase {
	public static void main(String[] args) {
		String s="trasformer";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=97 && ch[i]<=122)
				ch[i]=(char)((int)ch[i]-32);
		}
		System.out.print("Converting to upperCase: ");
		for(int i=0;i<ch.length;i++) 
			System.out.print(ch[i]);
	}
}
