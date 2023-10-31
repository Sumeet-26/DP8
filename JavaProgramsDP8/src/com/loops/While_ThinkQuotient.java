package com.loops;

public class While_ThinkQuotient {

	public static void main(String[] args) {
		
		int i=1;
		while(i<=15)
		{
			if(i%3==0 && i%5==0)
			   {
				System.out.println("Think");
				}
			else if(i%3==0)
			          {
				             System.out.println("Quotient");
			          }
			else if( i%5==0)
			{
				System.out.println("Think Quotient");
			}
				
				i++;
				
				
		}
		
		
		
		
		
		
		
		
		

	}

}
