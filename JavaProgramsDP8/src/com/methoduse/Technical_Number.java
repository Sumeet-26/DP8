package com.methoduse;

import java.util.Scanner;

public class Technical_Number {
   
	public int digitCount(int num)
	{
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		return count;
	}
	 
	public void calculateResult(int num)
	{
		int cnt=digitCount(num);
		System.out.println(cnt);
		int power=1;
		int temp=num;
		
		for(int i=1; i<=cnt/2; i++)
		{
			power=power*10;
		}
		if(cnt%2==0)
		{
			int num1=temp/power;
			int num2=temp%power;
			int sum=num1+num2;
			int square=sum*sum;
			if(square==temp)
				System.out.println("Technical Number");
			else
				System.out.println("Not a technical number");
		}
		else
			System.out.println("Not a technical number");	
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		Technical_Number obj=new Technical_Number();
		obj.calculateResult(num);
		
		
		
		
		
	}

}
