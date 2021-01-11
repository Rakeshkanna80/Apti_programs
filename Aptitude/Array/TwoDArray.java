import java.util.Scanner;

class TwoDArray
{
	public static void main(String[] args)
	{
		System.out.println("Main method started...");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
	
		int[][] arr=new int[n][n];
		
		System.out.println("Enter the Number of elements in array:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}

		System.out.println("The element of Array is:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

		int sumPD=0, sumSD=0, lowerSumSD=0, lowerSumPD=0,upperSumPD=0,upperSumSD=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
					sumPD+=arr[i][j];
				if(i+j==n-1)
					sumSD+=arr[i][j];
				if((i+j)>n-1)
					lowerSumSD+=arr[i][j];
				if(i>j)
					lowerSumPD+=arr[i][j];
				if(j>i)
					upperSumPD+=arr[i][j];
				if((i+j)<n-1)
					upperSumSD+=arr[i][j];
			}
		}
		System.out.println("Sum of Principal Diagonal is: "+sumPD);
		System.out.println("Sum of Secondary Diagonal is: "+sumSD);
		System.out.println("Upper Sum of Principal Diagonal is: "+upperSumPD);
		System.out.println("Lower Sum of Principal Diagonal is: "+lowerSumPD);
		System.out.println("Upper Sum of Secondary Diagonal is: "+upperSumSD);
		System.out.println("Lower Sum of Secondary Diagonal is: "+lowerSumSD);

		System.out.println("Main method ended...");
	}
}