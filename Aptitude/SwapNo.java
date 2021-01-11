class SwapNo
{
	public static void main(String[] args)
	{
		System.out.println("Main method started...");

		int a=10, b=20;
		int temp=0;

		System.out.println("Before Swapping a= "+a+ " b= "+b);

		temp=a;			//temp=10
		a=b;			//a=20
		b=temp;			//b=10

		System.out.println("After Swapping a= "+a+ " b= "+b);

		System.out.println("Main method ended...");
	}
}