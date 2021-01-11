package com.patterns.Triangle;

public class Pattern17 {
	public static void main(String[] args) {
		/*
		  		   *
				  ***
				 *****
				*******
				 *****
				  ***
				   *
						 */
		int row=7,star=1,space=3, mid=row/2;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			if(i<=mid) {
				star+=2;
				space--;
			}
			else {
				star-=2;
				space++;
			}
			System.out.println();
		}
	}
}
