import java.util.Scanner;

class ReverseArrayTemp {
	public static void main(String[] args) {
		System.out.println("Main method Started...");
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();

		int[] ar=new int[size];
		System.out.println("Enter the element of Array:");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<ar.length/2;i++) {
			temp=ar[i];
			ar[i]=ar[size-1-i];
			ar[size-1-i]=temp;
		}
		System.out.println("After Revese of an Array:");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+"\t");
		}

		System.out.println("\nMain method ended...");
	}
}