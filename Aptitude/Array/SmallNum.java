class SmallNum {
	public static void main(String[] args) {
  		System.out.println("Main method started...");
		
		int arr[]={10, 9, -268, 0, 5, -4, -8, 35, 95, -111};

		int small=arr[0];

		for(int i=1;i<arr.length;i++) {
			if(small>arr[i])
				small=arr[i];
		}
		System.out.println("Smallest Number: "+small);

  		System.out.println("Main method ended...");
	}

}
