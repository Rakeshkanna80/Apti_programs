import java.util.Scanner;
class PerfectNo {
	public static void main(String[] args) {
		System.out.println("Main method started...");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
	
		boolean b=isPerfect(num);
		
		if(b)
			System.out.println(num+" is a Perfect Number:");
		else	
			System.out.println(num+" is not a Perfect Number:");
			
		System.out.println("Main method ended...");
	}
	public static boolean isPerfect(int num) {
		int sum=0;

		for(int i=1;i<=num/2;i++) {
			if(num%i==0)
				sum+=i;	
    		}

		if(num==sum)
			return true;

		return false;
	}
}