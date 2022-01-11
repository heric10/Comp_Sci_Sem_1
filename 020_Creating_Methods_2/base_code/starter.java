import java.util.Scanner;
import java.util.Random;
class starter {
	public static int heric(int x, int y){
		int num1 = x;
		int num2 = y;
		int product = x+y;
		return product;
			}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your base number?");
		int x = sc.nextInt();
		//
		System.out.println("What is your exponent number?");
		int y = sc.nextInt();
		//
		int c = 0;
		while(true)
		{
		System.out.println(x);
		if(c == y)
		{
		break;
		}
		c = c + 1;
		}
		//
		int cool = heric(x,y);
		System.out.print("Your answer is: "+cool);
	}
}
