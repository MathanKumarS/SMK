# SMK

import java.util.Scanner;

public class PosNegZero {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value");
		int a = s.nextInt();
		if (a > 0) {
			System.out.println(a + " is a positive number");
		} else if (a < 0) {
			System.out.println(a + " is a negetive number");
		} else {
			System.out.println(a + " is neither negative nor positive");
		}
	}
}
