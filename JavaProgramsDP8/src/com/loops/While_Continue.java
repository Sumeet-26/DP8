package com.loops;

public class While_Continue {

	public static void main(String[] args) {
	
		int i=1;
		while(i<=15)
		{
			if(i%3==0 && i%9==0)
				continue;
			else
				System.out.println(i);
			
			i++;
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
