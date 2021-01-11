package com.patterns.Triangle;

public class Pattern4{
	public static void main(String[] args) {
		/*
		 	 *                         
			 *                         
			 *                         
			 *                         
			 *  *  *  *  *  *  *  *  * 
			 *                         
			 *                         
			 *                         
			 *                         

		 */
		int row=9;
		int column=9;
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				if(j==0 || i==row/2) {
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
