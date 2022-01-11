import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("I love to learn coding remotely."); 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter FirstName");
		String FirstName = sc.nextLine();
		System.out.print("Enter Age");
		int Age = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter your BirthMonth");
		String BirthMonth = sc.nextLine();
		System.out.print("Enter your BirthDay");
		int BirthDay = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter your BirthYear");
		int BirthYear = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter aBuckFifty");
		String aBuckFifty = sc.nextLine();
		
	}
}
