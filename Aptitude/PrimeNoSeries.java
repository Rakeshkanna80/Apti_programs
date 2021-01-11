import java.util.Scanner;

class PrimeNoSeries {
	public static void main(String[] args) {
		System.out.println("Main method started...");
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int limit=sc.nextInt();

		System.out.println("Prime Number between 1 to "+limit);
			
		for(int i=1;i<limit;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime)
				System.out.print(i+"\t");
		}
		
		System.out.println("\nMain method ended...");
	}	
}