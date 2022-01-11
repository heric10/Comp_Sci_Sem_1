import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Pick a number 1-1000");
		int testVar = sc.nextInt();
		//
		int luck = rand.nextInt(1000)+1;
		System.out.println(luck);
		
		boolean equation = luck<=testVar;
		if(equation)
		{
			{ System.out.println("You got larger"); }
		}
		else
		{
			{ System.out.println("You got smaller"); }
		}
		
	}
}
