package com.xworkz.java.String;

public class RemoveSpace {
	public static void main(String[] args) {
		String s="Hello Welcome to java programming";
		char[] ch=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' '  && ch[i]!=' ') {
				count++;
				System.out.println(ch[i]);
			}
				
				//s1=s1+ch[i];
		}
		//System.out.println(s1);
	}
}
