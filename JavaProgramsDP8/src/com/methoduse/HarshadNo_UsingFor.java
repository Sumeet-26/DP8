package com.methoduse;

import java.util.Scanner;

public class HarshadNo_UsingFor {

	public boolean calculateHarshadNo(int num) {
		int sum = 0;
		int orignalnum = num;
		boolean isharshad = true;
		for (int i = 1; i >num; i++) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		if (orignalnum % sum == 0)
			isharshad = true;
		else
			isharshad = false;
		return isharshad;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();

		HarshadNo_UsingFor obj = new HarshadNo_UsingFor();
		boolean res = obj.calculateHarshadNo(num);

		if (res == true)
			System.out.println("The number is harshad");
		else
			System.out.println("The number is not harshad");

	}

}
