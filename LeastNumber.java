# SMK

import java.util.Scanner;

public class LeastNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a = s.nextInt();
		int count=0;
		int num = a;
		while(num>0){
			num = num/10;
			count++;
		}
		int[] b=new int[count];
		for(int i=0;i<count;i++){
			b[i]=a%10;
			a /= 10;
		}
		for(int i=0;i<count-1;i++){
			for(int j=i+1;j<count;j++){
				if(b[i]>b[j]){
					int temp = b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		int ans = (b[0]*10)+b[1];
		if(ans<10){
			ans= (b[1]*10)+b[2];
		}
		System.out.println("Least number is "+ans);
	}

}
