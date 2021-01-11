import java.util.Scanner;

class PerfectNoSeries {
	public static void main(String[] args) {
		System.out.println("Main method started...");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();

		System.out.print("Series of Perfect No : ");
		int sum=0;
		for(int i=1;i<num;i++) {
			for(int j=1;j<i;j++) {
				if(i%j==0) 
					sum+=j;
			}
			if(sum==i)
				System.out.print(i +"\t");
			sum=0;
		}
	
		System.out.println("\n Main method ended...");	
	}
}