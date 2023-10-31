package com.loops;

public class DoWhile_SumOfOdd {

	public static void main(String[] args) {
		// sum of odd no bet 1 to 15 using do while
		
		int i=1;
		int sum=0;
				do
				{
					if(i%2!=0)
					{
						sum=sum+i;
					}
					i++;
				}while(i<=15);
		
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
	}

}
