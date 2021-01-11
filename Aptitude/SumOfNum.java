import java.util.Scanner;

class SumOfNum
{
	public static void main(String[] args) {
		System.out.println("Main method Started...");
		
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("Enter the Number: ");
		n=sc.nextInt();

		int[][] arr=new int[n][n];
		
		System.out.println("Enter the Number of elements: ");
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}

		System.out.println("The element of matrix is: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

		int sum=0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
					sum+=arr[i][j];
			}
			
		}
		System.out.println("Sum of All element in Array is: "+sum);

		System.out.println("Main method ended...");
  	}
}