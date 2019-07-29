package test;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int original = number;
		//int reverse;
		int r,sum=0;
		while(number>0) {
			r= number%10;
			sum = (sum*10)+r;
			number = number/10;
		}
		if(sum==original) {
			System.out.print("palindrom");
		}
		else {System.out.print("not p");}
		// TODO Auto-generated method stub

	}

}
