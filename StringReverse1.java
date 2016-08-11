# SMK

import java.util.Scanner;

public class StringReverse1 {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
		  System.out.println("Enter the string to reverse");
		  String input = s.next();
		  StringBuilder input1 = new StringBuilder();
		  input1.append(input);
		  input1=input1.reverse(); 
		  for (int i=0;i<input1.length();i++)
		  System.out.print(input1.charAt(i)); 
	}

}
