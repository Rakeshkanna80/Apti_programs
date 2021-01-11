package com.patterns.Triangle;


public class Pattern1 {
	public static void main(String[] args) {
		/*
		 	1
			12
			123
			1234

		 */
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++) {
				if(j<=i) {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}
