class Fibonacci
{
	public static void main(String[] args)
	{
		System.out.println("Main method started...");
		
		int n1=0, n2=1;
		System.out.print("\nFibonacci Series: "+n1+"\t"+n2);

		int res=0;
		for(int i=1;i<=8;i++)
		{
			res=n1+n2;
			System.out.print("\t"+res);
			n1=n2;
			n2=res;	
		}
		System.out.println("\n\nMain method ended...");
	}
}