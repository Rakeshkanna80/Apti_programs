package com.patterns.Triangle;

public class Pattern23 {
	public static void main(String[] args) {
		/*
		 	1           
			   2        
			      3     
			1  2  3  4  
			      3     
			   2        
			1           
			            
     
		 */
		int row=9,mid=row/2;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=mid;j++) {
				if(i==j ||i==mid ||i+j==row-1) {
					System.out.print(j+"  ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}
}
