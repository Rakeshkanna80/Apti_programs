import java.util.Scanner;

class BigThree{
	public static void main(String[] args)
	{
		System.out.println("Main method started...");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 number :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		if(a>b){
			if(a>c)
				System.out.println("Bigger Value is a="+a); 
			else
				System.out.println("Bigger Value is c="+c);
		}
		else {
			if(b>c)
				System.out.println("Bigger Value is b="+b);
			else 
				System.out.println("Bigger Value is c="+c);
		}

		System.out.println("Main method ended...");
	}
}