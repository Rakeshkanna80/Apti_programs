import java.util.Scanner;

class LeapYear {
	public static void main(String[] args) {
		System.out.println("Main method Started...");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year=sc.nextInt();

		if(year%400==0 || (year%4==0 && year%100!=0))
			System.out.println(year+ " is Leap year");
		else
			System.out.println(year+ " is not Leap year");	

		System.out.println("\nMain method ended...");
	}
}