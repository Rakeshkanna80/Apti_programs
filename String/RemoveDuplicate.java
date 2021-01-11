package com.xworkz.java.StringPractice;

public class RemoveDuplicate {
	static void removeDuplicate(String s) {
		int len=s.length();
		char[] ch=s.toCharArray();
		//int count;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(ch[i]==ch[j]) {
					int count=j;
					while(count<len && len<ch.length) {
						ch[count]=ch[count+1];
						count++;
					}
					j--;
					len++;
				}
			}
		}
		System.out.print("After removing duplicates: ");
		for(int k=0;k<len;k++) 
			System.out.print(ch[k]);
	}
	
	public static void main(String[] args) {
		String s="transformer";
		removeDuplicate(s);
	}
}
