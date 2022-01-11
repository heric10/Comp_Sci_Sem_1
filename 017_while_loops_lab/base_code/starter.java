import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name?");
	String num1 = sc.nextLine();
	System.out.println("Your name is "+num1);
	System.out.println(" ");
	//
	System.out.println("How many times should your name be outputed to the screen?");
	int num2 = sc.nextInt();
	System.out.print("You've decided to output your name " +num2);
	System.out.println(" times.");
	//
	System.out.println(" ");
	System.out.println("Pasting...");
	System.out.println(" ");
	//
	int c = 0;
	while(true)
	{
	System.out.println(num1);
	if(c == num2)
	{
	break;
	}
	c = c + 1;
	}
	}
}
