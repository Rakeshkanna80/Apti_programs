import java.util.Scanner;

class GCDNum {
	public static void main(String[] args) {
		System.out.println("Main method Started...");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number:");
		int num2=sc.nextInt();
		
		int gcd=1;
		for(int i=1;i<=num1/2 || i<=num2/2;i++) {
			if(num1%i==0 && num2%i==0)
				gcd=i;
		}
		System.out.println("Gretest Common Divisior of "+num1+ " and "+num2+ " is: "+gcd);

		System.out.println("\nMain method ended...");
	}
}