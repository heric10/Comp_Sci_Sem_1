import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	String wi = new String("wizard");
	String wa = new String("warrior");
	String ro = new String("rogue");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter wizard,warrior, or rogue. (Make sure it is lowercase)");
	String num1 = sc.nextLine();
	
	boolean num2 = ((num1.equalsIgnoreCase("wizard")) || (num1.equalsIgnoreCase("warrior")) || (num1.equalsIgnoreCase("rogue")));
	if(num2)
	{
	System.out.println("You have chosen "+num1);
	}
	else
	{
	System.out.println("You have decided not to play a role.");
	}
	}
}