package com.patterns.Triangle;

public class Pattern3 {
	public static void main(String[] args) {
		/*
		   1
		  21
		 321
		4321
		 321
		  21
		   1
		*/
		int rowLength=9;
		int columnLength=1;
		int mid=(rowLength/2)-1;
		int space=mid-1;
		
		for(int i=1;i<=rowLength;i++) {
			for(int j=0;j<=space;j++) {
				System.out.print(" ");
			}
			int num=columnLength;
			for(int k=0;k<columnLength;k++) {
				System.out.print(num);
				num--;
			}
			System.out.println();
			if(i<=mid) {
				space--;
				columnLength++;
			}
			else {
				space++;
				columnLength--;
			}
		}
	}
}


