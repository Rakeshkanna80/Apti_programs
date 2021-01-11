import java.util.Scanner;

class ArmStrongSeries {
	public static void main(String[] args) {
		System.out.println("Main method started...");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  limit :");
		int limit=sc.nextInt();

		System.out.print("Armstrong Numbers from 1 to "+limit+ " :");

		int num,sum=0,digit;
			for(int i=1;i<=limit;i++) {
				num=i;
				while(num>0) {
					digit=num%10;
					num=num/10;
					sum=sum+(digit*digit*digit);
				}
				if(sum==i)
					System.out.print(i+"\t");
				sum=0;
			}
			System.out.println("\nMain method ended...");
		}	
}