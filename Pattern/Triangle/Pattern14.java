package com.patterns.Triangle;

public class Pattern14 {
	public static void main(String[] args) {
		/*
		 		1    
				12   
				1 3  
				1  4 
				12345
				1  4 
				1 3  
				12   
				1    
				1    

		 */
		int rowLength=11;
		int mid=rowLength/2;
		
		for(int i=1;i<rowLength;i++) {
			for(int j=1;j<=mid;j++) {
			 if(i==j ||(i+j)==rowLength-1 ||j==1 ||i==mid){
				 System.out.print(j);
			 }
			 else {
				 System.out.print(" ");
			 }
			}
			System.out.println();
		}
	}
}
