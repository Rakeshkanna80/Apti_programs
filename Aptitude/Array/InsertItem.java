import java.util.Scanner;

class InsertItem {
	public static void main(String[] args) {
		System.out.println("Main method started...");

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		System.out.println("Enter the index number:");
		int index=sc.nextInt();
		
		int[] ar=new int[size];
		System.out.println("Enter the element of Array:");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		
		int[] tarAr=new int[ar.length+1];
		System.out.println("After inserting new element in array:");

		for(int i=0;i<tarAr.length;i++) {
			if(i<index)
				tarAr[i]=ar[i];
			else if(i==index)
				tarAr[i]=num;
			else
				tarAr[i]=ar[i-1];

			System.out.print(tarAr[i]+ "\t");
		}
		
		System.out.println("\nMain method ended...");
	}
}