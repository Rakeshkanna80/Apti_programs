class BigNum {
	public static void main(String[] args) {
		System.out.println("Main method started...");

			int[] arr={10, -3, 0, 4, 27, 5};
			int big=arr[0];

			for(int i=1;i<arr.length;i++) {
				if(big<arr[i])
					big=arr[i];
			}
			System.out.println("Biggest number of array is:= "+big);

		System.out.println("Main method ended...");
	}
}