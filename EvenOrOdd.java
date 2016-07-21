# SMK

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = s.nextInt();
		if (number == 0) {
			System.out.println("Number is Zero");
		} else if (number % 2 == 0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}

	}

}
