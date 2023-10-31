package com.methoduse;

public class Factorial_Using_For {

	
	public int calculateFactorial(int num)
	{
		int fact=1;
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;
		}
		return fact;
			
	}
	
	public static void main(String[] args) 
	{
		Factorial_Using_For obj=new 	Factorial_Using_For();
		int res=obj.calculateFactorial(5);
		System.out.println(res);
		
	}

}
