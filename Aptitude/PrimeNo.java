class PrimeNo
{
	public static void main(String[] args)
	{
		System.out.println("Main method started...");
		
		int num=29;
		boolean isPrime=true;

		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}

		if(isPrime==true)
			System.out.println(num+" is Prime number");
		else
			System.out.println(num+" is Not Prime number");

		System.out.println("Main method ended...");
	}
}