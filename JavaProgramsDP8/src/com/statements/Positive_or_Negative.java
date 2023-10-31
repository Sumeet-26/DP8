package com.statements;
import java.util.*;
public class Positive_or_Negative {

	public static void main(String[] args) {
		int num1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		num1=sc.nextInt();
		
		if(num1>0)
		{
			System.out.println("Given number is +ve");
		}
		else if(num1<0)
		{
			System.out.println("Given number is -ve");
		}
		
	}

}
