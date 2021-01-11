import java.util.Scanner;

class SumOfMidRowCol {
	public static void main(String[] args) {
		System.out.println("Main method Started...");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size=sc.nextInt();

		int[][] ar=new int[size][size];
		System.out.println("Enter the element of array:");
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length;j++) {
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("The element of array is:");
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length;j++) {
				System.out.print(ar[i][j]+ "\t");
			}
			System.out.println();
		}
		int rowSum=0, colSum=0;

		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length;j++) {
				if(i==size/2)
					rowSum+=ar[i][j];
				if(j==size/2)
					colSum+=ar[i][j];	
			}
		}
		System.out.println("Sum of middle row: "+rowSum);
		System.out.println("Sum of middle column: "+colSum);
		
		System.out.println("Main method ended...");
	}
}