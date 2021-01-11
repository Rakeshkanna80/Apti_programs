package com.patterns.SquarePattern;

public class Pattern6 {
	public static void main(String[] args) {
		/*
 			          *          
			          *          
			          *          
			 *  *  *  *  *  *  * 
			          *          
			          *          
			          *     

		 */
		int r=7;
		int c=7;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i==r/2 ||j==c/2)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			} 
			System.out.println();
		}
	}
}
