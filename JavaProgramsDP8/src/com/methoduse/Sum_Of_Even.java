package com.methoduse;

import java.util.Scanner;

public class Sum_Of_Even
{

	public void even(int num)
	{
		int sum = 0;
		int digit;
		while (num > 0)
		{
			digit = num % 10;
			if (digit % 2 == 0) 
			{
				sum = sum + digit;
			}
			num = num / 10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		Sum_Of_Even obj = new Sum_Of_Even();
		obj.even(num);

	}

}
