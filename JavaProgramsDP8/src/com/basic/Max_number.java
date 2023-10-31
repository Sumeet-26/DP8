package com.basic;

public class Max_number {

	public static void main(String[] args) {
		
		int num1=55;
		int num2=40;
		int num3=80;
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("This is the max number  "+num1);
		}
		else if(num2>num1  &&  num2>num3)
		{
			System.out.println("This is the max number  "+num2);
		}
	else 
	{
		System.out.println(" This is the max number "+num3);
	}
		
	}

}
