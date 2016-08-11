# SMK

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n < 0) {
			System.out.println("Enter the positive Number");
		} else {
			int fact = 1;
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
				System.out.println("Factorial of " + i + "is = " + fact);
			}
		}
	}

}
