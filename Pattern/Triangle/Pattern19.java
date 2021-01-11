package com.patterns.Triangle;

public class Pattern19 {
	public static void main(String[] args) {
		/*
		                 	1  
			            2      
			        3          
			    4              
			5                  
			    4              
			        3          
			            2      
			                1  
		*/
		int row=11, mid=row/2;
		for(int i=1;i<row;i++) {
			for(int j=mid;j>0;j--) {
				if(i==j ||i+j==row-1) {
					System.out.print(j+"  ");
				}
				else {
					System.out.print("    ");
				}
			}
			System.out.println();
		}
	}
}
