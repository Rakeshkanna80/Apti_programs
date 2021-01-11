import java.util.Scanner;

class ArmStrongNo {
		public static void main(String[] args) {
			System.out.println("Main method started...");

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number:");
			int num=sc.nextInt();

			int temp=num,sum=0,digit;

			while(num>0) {
				digit=num%10;
				num=num/10;
				sum=sum+(digit*digit*digit);
			}
			if(temp==sum)
				System.out.println(temp+" is Armstrong number:");
			else
				System.out.println(temp+" is Not Armstrong number:");

			System.out.println("Main method ended...");
		
		}	
}