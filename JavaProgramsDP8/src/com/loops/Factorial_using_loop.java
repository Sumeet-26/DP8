package com.loops;
import java.util.*;
public class Factorial_using_loop {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int sum=sc.nextInt();
		int fact=1;//we have to multiply so we take 1 else we take 0(for addition subtraction)
		
		for(int i=1;i<=sum;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
		
		
		
		
		
		
		

	}

}
