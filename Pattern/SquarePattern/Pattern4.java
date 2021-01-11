package com.patterns.SquarePattern;

public class Pattern4 {
	public static void main(String[] args) {
		/*
 			 *  *  *  *  *  *  * 
			 *  *              * 
			 *     *           * 
			 *        *        * 
			 *           *     * 
			 *              *  * 
			 *  *  *  *  *  *  * 
		 */
		int r=7;
		int c=7;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i==0 || i==r-1 || j==0 || j==c-1 ||i==j)
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
