package com.methoduse;

public class HarshadNumber {
                 //harshad number is an no which is divisible by its sum 
	//int n;
	public void checkNum ()
	{
		int sum=0;
		int num=156;
		int rem=0;//remainder
		int n = 0;
		
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		
		if(n%sum==0)
		System.out.println("Number is harshad no");
		else
		System.out.println("number not is not harshad no");
	}
	
	public static void main(String[] args) 
	{
		 HarshadNumber obj=new  HarshadNumber ();
		 obj.checkNum();
		
		
		
		
		
	}

}
