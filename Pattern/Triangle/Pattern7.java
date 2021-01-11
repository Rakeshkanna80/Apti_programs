package com.patterns.Triangle;

public class Pattern7 {
	public static void main(String[] args) {
		/*
		 		 *             
				 *  *          
				 *     *       
				 *        *    
				 *           * 
				 *        *    
				 *     *       
				 *  *          
				 *             

		 */
		int row=9;
		int column=9;
		int mid=row/2;
		for(int i=0;i<row;i++) {
			for(int j=0;j<=mid;j++) {
				if(i==j || j==0 ||(i+j)==row-1) {
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
