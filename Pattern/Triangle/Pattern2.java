package com.patterns.Triangle;

public class Pattern2 {
	public static void main(String[] args) {
		/*
		 		1
				12
				123
				1234
				123
				12
				1
		 */
		int rowLength=7;
		int columnLength=1;
		int mid=rowLength/2;
		
		for(int i=1;i<=rowLength;i++) {
			for(int j=1;j<=columnLength;j++) {
				System.out.print(j);
			}
			System.out.println();
			if(i<=mid) {
				columnLength++;
			}
			else {
				columnLength--;
			}
		}
	}
}
