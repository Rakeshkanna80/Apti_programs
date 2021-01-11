package com.xworkz.java.Array;

public class AddTwoArray {
	public static void main(String[] args) {
		int[] ar1= {1,2,3,4,5};
		int[] ar2= {6,7,8,9,10};
		int[] addTwoArr=new int[ar1.length+ar2.length];
		for(int i=0;i<addTwoArr.length;i++) {
			if(i<ar1.length)
				addTwoArr[i]=ar1[i];
			else
				addTwoArr[i]=ar2[i-ar2.length];
		}
		for(int i=0;i<addTwoArr.length;i++)
			System.out.print(addTwoArr[i]+" ");
	}
}
