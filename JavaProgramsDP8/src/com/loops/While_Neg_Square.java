package com.loops;

public class While_Neg_Square {

	public static void main(String[] args) {

     //write a code to display no bet 1 to 50
	//if number is even then display square	
	//if no is odd display its -ve form
		
		int i=1;
		while(i<=50)
		{
			if(i%2==0)
				System.out.println(i*i);
			else
			System.out.println(i*-1);
			i++;
		}
		
		
		
		
		

	}

}
