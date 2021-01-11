class SwapThreeNum
{
	public static void main(String[] args)
	{
		System.out.println("Main method started...");

		int a=15, b=25, c=35;

		System.out.println("\nBefore Swapping a=" +a+ " b="+b+ " c="+c);

		a=a+b+c;			// Sum A=75
		b=a-b-c; 			// B=15
		c=a-b-c; 			// C=25
		a=a-b-c;			// A=35

		System.out.println("\nAfter Swapping a=" +a+ " b="+b+ " c="+c);

		System.out.println("\nMain method ended...");
	}
}