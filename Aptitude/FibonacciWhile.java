class FibonacciWhile
{
	public static void main(String[] args)
	{
		System.out.println("Main method started...");

		int n1=0, n2=1;
		System.out.print("\nFibonacci Series: "+ n1+ "\t"+ n2);
		
		int i=1, res=0;
		while(i<=8)
		{
			res=n1+n2;
			System.out.print("\t"+res);
			n1=n2;
			n2=res;

			i++;	
		}
		System.out.println("\n\nMain method ended...");
	}
}