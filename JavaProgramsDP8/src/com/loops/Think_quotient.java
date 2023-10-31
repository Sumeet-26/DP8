package com.loops;

public class Think_quotient {

	public static void main(String[] args) {
		int i;
		for(i=1; i<=15; i++) 
		{
			if(i%3==0 && i%5==0) 
			{
				System.out.println("Think  "+i);
			}
			else if(i%3==0) 
			{
				System.out.println("Quotient "+i);
			}
			else if( i%5==0)
			{
				System.out.println("Think Quotient "+i);
			}
			System.out.println(i);
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
