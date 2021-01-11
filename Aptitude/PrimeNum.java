class PrimeNum
{
	public static void main(String[] args)
	{
		System.out.println("main method started...");
	
		System.out.println("Prime Numbers are:");
		for(int i=1;i<=150;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(i==j)
					System.out.print(i+ "\t");
				if(i%j==0)
					break;
			}
		}
		System.out.println("\nmain method ended...");
	}

}