import java.util.Scanner;

class CalUsingChar
{
	public static void main(String[] args)
	{
		System.out.println("Main method started...");

		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter two number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("\nChoose one of the following: \n"
				+" +. Addition \t -. Substraction \n"
				+" *. Multiplication \t /. Division \n"
				+" %. Modulo \n");

		char ch=sc.next().charAt(0);
		int res=0;

		switch(ch)
		{
			case '+' :res=a+b;
				System.out.println("Sum is ="+res);
				break;

			case '-' :res=a-b;
				System.out.println("Difference is ="+res);
				break;

			case '*' :res=a*b;
				System.out.println("Product is ="+res);
				break;

			case '/' :res=a/b;
				System.out.println("Quotient is : ="+res);
				break;

			case '%' :res=a%b;
				System.out.println("Remainder is : ="+res);
				break;

			default:
				System.out.println("Sorry! No such option available");
		}
		System.out.println("\nMain method ended...");
	}
}