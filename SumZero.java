# SMK

import java.util.Scanner;

public class SumZero {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");;
		int a = s.nextInt();
		int[] b = new int[a];
		for(int i=0;i<a;i++){
			b[i]=s.nextInt();
		}
		for(int i=0;i<a-1;i++){
			for(int j=i+1;j<a;j++){
				if(b[i]+b[j]==0){
					System.out.println("Elements are "+b[i]+" "+b[j]);
				}
			}
		}
	}
}
