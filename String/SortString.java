package com.xworkz.java.StringPractice;

public class SortString {
	public static void main(String[] args) {
		String s="entertainment";
		char[] ch=s.toCharArray();
		char temp=0;
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch.length-1;j++) {
				if(ch[j]>ch[j+1]) {
					temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
		System.out.print("After sorting the string: ");
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+ " ");
		}
	}
}
