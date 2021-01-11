package com.patterns.Triangle;

public class Pattern21 {
	public static void main(String[] args) {
		/*
		   		 1 
		         1 
		         1 
		         1 
		4 3 2 1 
		         1 
		         1 
		         1 
		         1 

		 */
		int row=8,mid=row/2;
		for(int i=0;i<=row;i++) {
			for(int j=mid;j>0;j--) {
				if(i==mid ||j==1) {
					System.out.print(j+" ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
