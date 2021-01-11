package com.patterns.SquarePattern;

public class Pattern2 {
	public static void main(String[] args) {
		/*
		 1	1	1	1
		 2			2
		 3			3
		 4	4	4	4
		 */
		for(int i=1;i<=4;i++) 
		{
			for(int j=1;j<=4;j++) 
			{
				if(i==1 || i==4 ||j==1 ||j==4) {
					System.out.print(i);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
