import java.util.Scanner;

class CalUsingString
{
	public static void main(String[] args)
	{
		System.out.println("Main method started...");

		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter two number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("\nChoose one of the following: \n"
				+" \"add\". Addition \t \"sub\". Substraction \n"
				+" \"mul\". Multiplication \t \"div\". Division \n"
				+" \"mod\". Modulo \n");

		String opt=sc.next();
		int res=0;

		switch(opt)
		{
			case "add" :res=a+b;
				System.out.println("Sum is ="+res);
				break;

			case "sub" :res=a+b;
				System.out.println("Difference is ="+res);
				break;

			case "mul" :res=a*b;
				System.out.println("Product is ="+res);
				break;

			case "div" :res=a/b;
				System.out.println("Quotient is : ="+res);
				break;

			case "mod" :res=a%b;
				System.out.println("Remainder is : ="+res);
				break;

			default:
				System.out.println("Sorry! No such option available");

		}
		System.out.println("\nMain method ended...");
	}
}