package com.loops;
import java.util.Scanner;
public class SumOfDigitWhile {

	public static void main(String[] args) {
		
		// find the digit sum from the number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num =sc.nextInt();
		int sum=0;
		
		while(num>0)
		{
			int digit = num%10;
			sum=sum+digit;
			num=num/10;	
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
