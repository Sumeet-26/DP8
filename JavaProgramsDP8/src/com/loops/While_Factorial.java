package com.loops;
import java.util.Scanner;
public class While_Factorial {

	public static void main(String[] args) {
		
		// display factorial of given number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		int i = 1  ;
		int fact=1;// always take 1 when we want to multiply
		while(i<=num) 
		{
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
		
		
		
		
		
		
	}

}
