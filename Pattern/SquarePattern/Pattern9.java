package com.patterns.SquarePattern;

public class Pattern9 {
	public static void main(String[] args) {
		/*
		 2		3		5		7
		 11		13		17		19
		 23		29		31		37
		 41		43		47		53
		 
		 */
		int num=2;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				for(int k=2;k<=(num/2)+1;k++) {
					if(num%k==0 && k!=num) {
						num++;
					}
				}
				System.out.print(num+"\t");
				num++;
			}
			System.out.println();
		}
	}
}
