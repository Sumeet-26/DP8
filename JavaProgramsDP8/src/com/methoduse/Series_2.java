package com.methoduse;

public class Series_2
{

	public void cube() 
	{               // display series 1,8,27,64,125....

		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(i * i * i);
		}

	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Series_2 obj = new Series_2();
		obj.cube();

	}
	
}
