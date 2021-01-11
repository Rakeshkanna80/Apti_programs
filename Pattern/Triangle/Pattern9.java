package com.patterns.Triangle;

public class Pattern9 {
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
				if(i==j ||(i+j)==row-1 ||i==mid) {
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
