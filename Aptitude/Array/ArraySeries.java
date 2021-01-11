import java.util.Scanner;

class ArraySeries {
	public static void main(String[] args) {
		System.out.println("Main method started...");

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();

		int[] ar=new int[size];
		System.out.println("Enter the element of array: ");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
	
		int[] tarArr=new int[size];
		int sqr=1;
		for(int i=0;i<ar.length;i++) {
			tarArr[i]=ar[i]*sqr;
			sqr*=2;
		}

		for(int i=0;i<ar.length;i++) {
			System.out.print(tarArr[i]+ "\t");
		}		
		System.out.println("\nMain method ended...");
	}
}