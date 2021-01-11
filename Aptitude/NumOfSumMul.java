class NumOfSumMul
{
	public static void main(String[] args)
	{
		System.out.println("Main method started...");

		int sum=0, mul=1;
		for(int i=1;i<=10;i++)
		{
			sum+=i;
			mul*=i;	
		}
		System.out.println("Sum is= "+sum+ "\nProduct is= "+mul);

		System.out.println("Main method ended...");
	}
}