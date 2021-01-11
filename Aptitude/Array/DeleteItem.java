import java.util.Scanner;

class DeleteItem {
	public static void main(String[] args) {
		System.out.println("Main method started...");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		
		int[] ar=new int[size];
		System.out.println("Enter the element of Array:");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}

		System.out.println("Enter the number you want to delete from array:");
		int num=sc.nextInt();
			
		int tarAr[]=new int[ar.length];
		int j=0;
		System.out.println("\nAfter Deleting the element in Array:");
		for(int i=0;i<tarAr.length;i++) {
			if(ar[i]!=num) 
				tarAr[j++]=ar[i];	
		}

		for(int i=0;i<tarAr.length;i++) {
			if(tarAr[i]!=0) 
				System.out.print(tarAr[i]+"\t");	
	
		}
		
		System.out.println("\nMain method ended...");
	}
}