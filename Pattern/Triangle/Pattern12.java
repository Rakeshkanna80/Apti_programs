package com.patterns.Triangle;

public class Pattern12 {
	public static void main(String[] args) {
		/*
		 	1    
			 2   
			  3  
			   4 
			12345
			   4 
			  3  
			 2   
			1    
		*/
		int rowLength=11;
		int mid=rowLength/2;
		
		for(int i=1;i<=rowLength;i++) {
			for(int j=1;j<=mid;j++) {
			 if(i==j ||i==mid ||(i+j)==rowLength-1){
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
