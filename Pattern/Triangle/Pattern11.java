package com.patterns.Triangle;

public class Pattern11 {
	public static void main(String[] args) {
		/*
		 		         * 
			             * 
			             * 
			             * 
			 *  *  *  *  * 
			             * 
			             * 
			             * 
			             * 

		 */
		int row=9;
		int column=9;
		int mid=row/2;
		for(int i=0;i<row;i++) {
			for(int j=mid;j>=0;j--) {
				if(i==mid ||j==0) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
