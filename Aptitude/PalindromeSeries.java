import java.util.Scanner;

class PalindromeSeries {
	public static void main(String[] args) {
		System.out.println("Main method started...");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int limit=sc.nextInt();

		System.out.print("Palindrome Numbers from 1 to "+limit+ " :");
		
		int rem=0,rev=0,num;
		for(int i=1;i<=limit;i++) {
			num=i;	
			while(num>0) {
				rem=num%10;
				num=num/10;
				rev=(rev*10)+rem;
			}
			if(rev==i) 
				System.out.print(rev+"\t");
			rev=0;
		}
		System.out.println("\nMain method ended...");
	}
}