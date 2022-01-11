import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int num1 = rand.nextInt(10);
		System.out.println(num1);
		int num2 = rand.nextInt(100)+1;
		System.out.println(num2);
		double num3 = rand.nextDouble()+2.5;
		System.out.println(num3);
		int num4 = rand.nextInt(575)+14;
		System.out.println(num4);
	}
}
