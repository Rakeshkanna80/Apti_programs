package com.patterns.Triangle;

public class Pattern20 {
	public static void main(String[] args) {
		/*
		 	1                            
			1                            
			1                            
			1                            
			1 2 3 4 5 6 7 8 9 10 
			1                            
			1                            
			1                            
			1                            
			1                            

		 */
		int row=10,mid=row/2;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(j==1 || i==mid) {
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
