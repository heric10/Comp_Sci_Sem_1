import java.util.Scanner;
class starter {
	public static String heric(int x, int y){
		int num1 = x;
		int num2 = y;
		int product = num1*num2;
		if (product%3 == 0){
			return "It's divisible by 3";
		}
		else{
			return "It's not divisible by 3";
		}
	}
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	int x = sc.nextInt();
	//
	System.out.println("Enter another number:");
	int y = sc.nextInt();
	System.out.println(heric(x,y));
	}
}
