import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("I love to learn coding remotely.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num1 = sc.nextInt();
		System.out.println("Enter Number");
		int num2 = sc.nextInt();
		
		boolean equation = num1!=num2;
		boolean equation2 = num1 == num2;
		if (equation)
		{ System.out.println("The two variables are different."); }
		if(equation2)
		{
			System.out.println("The two variables are the same!");
		}
		
	}
}
