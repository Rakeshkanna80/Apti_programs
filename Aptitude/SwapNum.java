class SwapNum
{
	public static void main(String[] args)
	{
		System.out.println("Main method started...");

		int a=15, b=25;

		System.out.println("\n Before Swapping a=" +a+ " b="+b);

		a=a+b;			//a=40
		b=a-b;  		//b=15
		a=a-b;			//a=25

		System.out.println("\n After Swapping a=" +a+ " b="+b);

		System.out.println("Main method ended...");
	}
}