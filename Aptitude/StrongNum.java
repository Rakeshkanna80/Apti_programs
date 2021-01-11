import java.util.Scanner;

class StrongNum {
	public static void main(String[] args) {
		System.out.println("Main method started...");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();

		int rem=0, sum=0, temp=num;

		while(num>0) {
			rem=num%10;
			num=num/10;
			sum=sum+StrongNum.fact(rem);
		}
		System.out.println("Sum is:"+sum);

		if(temp==sum)
			System.out.println(temp+" is Strong Number");
		else
			System.out.println(temp+" is Not Strong Number");

		System.out.println("Main method ended..");
	}
		
	public static int fact(int num) {
		int fact=1; 
		while(num>0) {
			fact*=num;
			num--;
		}
		return fact;
	}
}