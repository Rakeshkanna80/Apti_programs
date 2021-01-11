import java.util.Scanner;

class Calculator
{
	public static void main(String[] args)
	{
		System.out.println("Main method started... ");

		Scanner sc=new Scanner(System.in);

		char rep='y';
		while(rep=='y') {

			System.out.println("Enter 2 Number:");
			int a=sc.nextInt();
			int b=sc.nextInt();

			System.out.println("Choose one of the following \n" 
					+ "1.Addition \t 2.Substraction \n" 
					+ "3.Multiplication \t 4.Division");

			int choice=sc.nextInt();
			int res=0;

			switch(choice){
				case 1:res=a+b;
					System.out.println("Sum ="+res);
					break;
				case 2:res=a-b;
					System.out.println("Diff ="+res);
					break;
				case 3:res=a*b;
					System.out.println("Product="+res);
					break;
				case 4:res=a/b;
					System.out.println("Quotient ="+res);
					break;
				default:
					System.out.println("No such option available");			
			}
			System.out.println("Do you want to repeat again:");
			rep=sc.next().charAt(0);
		}
		System.out.println("Main method ended... ");
	}
}