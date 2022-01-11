import java.util.Scanner;
import java.util.Random;

class starter {
	public static void add(String x, String y) {
		String equation = x;
		String equation = x+y;
		System.out.println(equation);
		System.out.println(equation2);
		return;
	}
	public static void main(String args[]) {
		// Your code goes below here
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence.");
		String x = sc.nextLine();
		//
		System.out.println("Write another sentence.");
		String y = sc.nextLine();
		//
		add(x,y);
	}
}
