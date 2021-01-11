class SmallNo {
	public static void main(String[] args)
	{
		System.out.println("main method started...");

		int[] ar={27, 5, -8, 9, -9, 98};

		int i, temp=0;
		for(i=0;i<ar.length-1;i++)
		{
				if(ar[i]<ar[i+1]) 
				{
					temp=ar[i];
					ar[i]=ar[i+1];
					ar[i+1]=temp;
				}
		}

		System.out.println("Small Number: "+ar[i]);

		System.out.println("main method ended...");
	}
}
