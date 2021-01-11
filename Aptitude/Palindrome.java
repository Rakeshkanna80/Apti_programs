import java.util.Scanner;

class Palindrome {
	public static void main(String[] args) {
		System.out.println("Main method started...");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		
		int rem=0,rev=0,temp=num;
		while(num>0) {
			rem=num%10;
			num=num/10;
			rev=(rev*10)+rem;
		}

		if(temp==rev) 
			System.out.println(rev+"\nGiven Number is Palindrom");
		else
			System.out.println(rev+"\nGiven Number is not Palindrom");

		System.out.println("Main method ended...");
	}
}