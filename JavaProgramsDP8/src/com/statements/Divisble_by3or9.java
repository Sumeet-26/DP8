package com.statements;
import java.util.*;
public class Divisble_by3or9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		
		if(num%3==0 && num%9==0) 
		{
			System.out.println("Given num is divisible by 3 and 9");
		}
		else if(num%9==0)
		{
			System.out.println("Given number is divisible by 9");
		}
		else if(num%3==0)
		{
			System.out.println("Given number is divisble by 3 ");
		}
		else 
		{
			System.out.println("Given number is not divisble by 3 or 9");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
