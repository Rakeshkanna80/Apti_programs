import java.util.Scanner;

class ReverseArray {
	public static void main(String[] args) {
		System.out.println("Main method started...");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		
		int[] ar=new int[size];
		System.out.println("Enter the element in array:");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}	
		
		int[] tarAr=new int[size];
		for(int i=0;i<ar.length;i++) {
			tarAr[i]=ar[ar.length-1-i];
		}
	
		System.out.println("\nAfter Reverse of an Array is:");
		for(int i=0;i<ar.length;i++) {
			System.out.print(tarAr[i]+"\t");
		}	

		System.out.println("\nMain method ended...");
	}
}