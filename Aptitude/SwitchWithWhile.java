import java.util.Scanner;

class SwitchWithWhile
{
	public static void main(String[] args)
	{
		System.out.println("Main method started...");

		Scanner sc=new Scanner(System.in);
		
		char rep='y';
		while(rep=='y')
		{
			System.out.println("\nChoose one of the charter from: \n"
				+"j.Java \t\t\t" + "e.JEE \t\t\t" + "s.SQL \n"
				+"w.Web Technology \t"+"f.Frameworks \t"+"p.Project \n");
		
			System.out.println("Enter the character:");
			char choice=sc.next().charAt(0);

			switch(choice)
			{
				case 'j':
					System.out.println("\nCourse is Java");
					break;
				case 'e':
					System.out.println("\nCourse is JEE");
					break;
				case 's':
					System.out.println("\nCourse is SQL");
					break;
				case 'w':
					System.out.println("\nCourse is Web Technology");
					break;
				case 'f':
					System.out.println("\nCourse is Frameworks");
					break;	
				case 'p':
					System.out.println("\nCourse is Project");
					break;
				default:
					System.out.println("\nSorry! No more Course available");			
			}

			System.out.println("\nDo You Want to Print again:");
			rep=sc.next().charAt(0);
		}

		System.out.println("\nMain method ended...");
	}
}