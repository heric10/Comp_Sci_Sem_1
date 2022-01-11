import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	String wi = new String("wizard");
	String wa = new String("warrior");
	String ro = new String("rogue");
	//
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name?");
	String num1 = sc.nextLine();
	System.out.println("Your name is "+num1);
	//
	System.out.println("What is your title? Ex: Slayer of Dragons");
	String num4 = sc.nextLine();
	System.out.println("Your title is "+num4);
	//
	System.out.println("Enter wizard, warrior, or rogue. (Make sure it is lowercase)");
	String num3 = sc.nextLine();
	
	boolean num8 = ((num3.equals("wizard")) || (num3.equals("warrior")) || (num3.equals("rogue")));
	if(num8)
	{
	System.out.println("You have chosen "+num3);
	}
	else
	{
	System.out.println("You have decided not to play a role. Rerun program.");
	return;
	}
	//
	System.out.println("You have 25 skill points to spend. Chose from the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely");
	System.out.println(" ");
	System.out.print("Strength (1-10): ");
	int num5 = sc.nextInt();
	int sum = 25-num5;
	boolean equation = num5<=10;
	if (equation)
	{
	System.out.println("You have "+sum+" left to spend");
	}
	else
	{
	System.out.println("You chose too high of a number, pick again.");
	num5 = sc.nextInt();
	}
	//
	System.out.println(" ");
	System.out.print("Dexterity (1-10): ");
	int dex = sc.nextInt();
	int sum1 = sum-dex;
	boolean equation2 = dex<=10;
	if (equation)
	{
	System.out.println("You have "+sum1+" left to spend");
	}
	else
	{
	System.out.println("You chose too high of a number, pick again.");
	dex = sc.nextInt();
	}
	//
	System.out.println(" ");
	System.out.print("Intelligence (1-10): ");
	int brain = sc.nextInt();
	int sum2 = sum1-brain;
	boolean equation3 = brain<=10;
	if (equation3)
	{
	System.out.println("You have "+sum2+" left to spend");
	}
	else
	{
	System.out.println("You chose too high of a number, pick again.");
	brain = sc.nextInt();
	}
	//
	System.out.println(" ");
	System.out.print("Constitution (1-10): ");
	int con = sc.nextInt();
	int sum3 = sum2-brain;
	boolean equation4 = con<=10;
	if (equation4)
	{
	System.out.println("You have "+sum3+" left to spend");
	}
	else
	{
	System.out.println("You chose too high of a number, pick again.");
	con = sc.nextInt();
	}
	//
	System.out.println(" ");
	System.out.print("Charisma (1-10): ");
	int charisma = sc.nextInt();
	int sum4 = sum3-charisma;
	boolean equation5 = con<=10;
	if (equation4)
	{
	System.out.println("You have "+sum4+" left to spend");
	}
	else
	{
	System.out.println("You chose too high of a number, pick again.");
	charisma = sc.nextInt();
	}
	//
	System.out.println(" ");
	System.out.println("--------------------------------------------");
	System.out.print("You are "+num1);
	System.out.print(", the ");
	System.out.println(num4+" of CVHS.");
	System.out.print("You're a ");
	System.out.println(num3+" with the following stats!");
	System.out.println("Strength - "+num5);
	System.out.println("Dexterity - "+dex);
	System.out.println("Intelligence - "+brain);
	System.out.println("Strength - "+con);
	System.out.println("Charisma - "+charisma);
	System.out.println(" ");
	System.out.print("Good luck on your quest, "+num1);
	System.out.print("!");
	}
}