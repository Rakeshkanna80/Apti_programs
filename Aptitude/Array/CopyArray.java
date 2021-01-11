import java.util.Scanner;

class CopyArray {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of Array");
	int len=sc.nextInt();

	int[] ar=new int[len];	
	System.out.println("Enter "+len+ " Element in Array"); 
	for(int i=0;i<ar.length;i++) {
		ar[i]=sc.nextInt();
	}
	
	int[] newAr=new int[len];
	for(int i=0;i<ar.length;i++) {
		newAr[i]=ar[i];
	}
	System.out.println("Element of Orignal Array :");	
	for(int i=0;i<ar.length;i++) {
		System.out.print(ar[i]+ " ");
	}
		System.out.println();

	System.out.println("Element of New Array :");	
	for(int i=0;i<newAr.length;i++) {
		System.out.print(newAr[i]+ " ");
	}	
	}
}