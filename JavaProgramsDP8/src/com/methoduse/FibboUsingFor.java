package com.methoduse;

public class FibboUsingFor {
// fibbonacci series display if divisible by 5
	
	public void fibbo(int terms) 
	{
		int num1=0,num2=1,num3;
		System.out.println(num1+" "+num2+" ");
		
		for(int i=2;i<terms;i++)
		{
			num3=num1+num2;
			if(num3%5==0)
			{
			System.out.println(num3+" ");
			}
			num1=num2;
			num2=num3;		
		}
			
	}
	public static void main(String[] args) {
		
		FibboUsingFor obj=new FibboUsingFor();
		obj.fibbo(20);

		
		
		
	}

}
