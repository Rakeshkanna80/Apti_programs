package com.patterns.Triangle;

public class Pattern13 {
	public static void main(String[] args) {
		/*\
		 	0                      
			0  1                  
			0      2              
			0          3          
			0              4      
			0                  5  
			0              4      
			0          3          
			0      2              
			0  1                  
			0                      
		*/
		int rowLength=11;
		int mid=rowLength/2;
		
		for(int i=0;i<rowLength;i++) {
			for(int j=0;j<=mid;j++) {
			 if(i==j ||j==0||(i+j)==rowLength-1){
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
