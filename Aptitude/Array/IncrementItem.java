class IncrementItem
{
	public static void main(String[] args){
		System.out.println("main method started...");

		int[] intArr={10,20,30,40,50};

		for(int i=0;i<intArr.length;i++) {
			intArr[i]+=1;
		}

		System.out.println("Array Elements are:");
		for(int i=0;i<intArr.length;i++) {
			System.out.print(intArr[i]+"\t");
		}

		System.out.println("\nmain method ended...");
	}
}