// input - 8	25	32
// output- 8 	50	128

import java.util.Scanner;

class ArrayPowerSeries {
	public static void main(String[] args) {
		System.out.println("Main method started...");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();

		int[] ar=new int[size];
		System.out.println("Enter the element of array:");
		for(int i=0;i<size;i++) {
			ar[i]=sc.nextInt();
		}
			
		int tarArr[]=new int[size];
		for(int i=0;i<ar.length;i++) {
			int num=multipleOfTwo(i,2);
			tarArr[i]=ar[i]*num;
		}

		for(int i=0;i<ar.length;i++) {
			System.out.print(tarArr[i]+ "\t");
		}
	
		System.out.println("\nMain method ended...");
	}

	public static int multipleOfTwo(int pow, int n) {
		int res=1;

		if(pow==0)
			return res;
		else {
			for(int i=1;i<=pow;i++) {
				res*=n;
			}
		}
		return res;
	}
}