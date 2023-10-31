package com.loops;

public class Display_no_Continue {

	public static void main(String[] args) {
		//Write a code display no between 1 to 50 if any no is divisible by 3 & 9
		// then skip no
		
		int i ;
		for (i=1; i<=50; i++)
		{
			  if (i%3==0 && i%9==0) 
			        continue;
			  else
				  System.out.println(i);
			  
				  
			  
		}
		
		
		
		
		
		
		

	}

}
