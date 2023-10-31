package com.methoduse;

public class Sum_1to5_UsingMethod {

	public void Sum()
	{
		int sum=0;
		int i;
		for( i=1;i<=5;i++)
		{
			sum=sum+i;
			
		}
		System.out.println(i);
		
	}
		
	public static void main(String[] args) 
	{
		Sum_1to5_UsingMethod obj= new Sum_1to5_UsingMethod ();
		obj.Sum();
		
		
	}

}
