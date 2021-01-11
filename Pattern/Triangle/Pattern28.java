package com.patterns.Triangle;

public class Pattern28 {
	public static void main(String[] args) {
	/*	    *    
		   * *   
		  *   *  
		 *     * 
		*       *
		 *     * 
		  *   *  
		   * *   
		    *    
	*/
		int row=9,mid=row/2+1;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(j==mid || j==row-mid+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			if(i<=row/2) {
				mid--;
			}
			else {
				mid++;
			}
			System.out.println();
		}
		
	}
}
