import java.util.Scanner;

class ReverseNo {
	public static void main(String[] args) {
		System.out.println("Main method started..");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();

		int rem=0, rev=0;
		while(num>0) {
			rem=num%10;	
			num=num/10;
			rev=(rev*10)+rem;
		}
		
		System.out.println("Reverse Number:"+rev);

		System.out.println("Main method ended..");
	}
}