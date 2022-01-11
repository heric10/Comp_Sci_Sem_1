import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("Guess a number 1-1000:");
	int num1 = sc.nextInt();
	//
	Random rand = new Random();
	int num2 = rand.nextInt(1000)+1;
	while(true)
	{
		if(num1==num2)
		{
		System.out.println("You guessed it!");
		break;
		}
		else if (num1>num2)
		{
		System.out.println("Your guess was too high!");
		System.out.println(" ");
		}
		//
		else if (num2>num1)
		{
		System.out.println("Your guess was too low!");
		System.out.println(" ");
		}
		num1 = sc.nextInt();
	}
	}
}
