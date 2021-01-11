import java.util.Scanner;

class MultiplicationTable {
	public static void main(String[] args) {
		System.out.println("Main method Started...");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
	
		for(int i=1;i<=10;i++) {
			System.out.println(num+ " * "+ i + "= "+num*i);
		}

		System.out.println("\nMain method Ended...");
	}
}