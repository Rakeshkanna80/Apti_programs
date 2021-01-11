import java.util.Scanner;

class LCMNum {
	public static void main(String[] args) {
		System.out.println("Main method Started...");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number:");
		int num2=sc.nextInt();
		System.out.println("Enter the Third Number:");
		int num3=sc.nextInt();
		
		int gcd=1;
		for(int i=1;i<num1 && i<num2 && i<num3;i++) {
			if(num1%i==0 && num2%i==0 && num3%i==0)
				gcd=i;
		}
		int lcm=(num1*num2*num3)/gcd;

		System.out.println("LCM of "+num1+ " , "+num2+ " and "+num3+ " is:"+lcm);

		System.out.println("\nMain method ended...");
	}
}