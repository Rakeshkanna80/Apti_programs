import java.util.Scanner;

class FactorialWhile
{
	public static void main(String[] args)
	{
		System.out.println("Main method started...");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt(); 

		int i=num, fact=1;

		while(num>0)
		{
			fact*=num;
			num--;
		}	
		System.out.println(i+"!="+fact);
		
		System.out.println("\n Main method ended...");
	}
}