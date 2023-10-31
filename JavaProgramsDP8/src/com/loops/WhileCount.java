package com.loops;

public class WhileCount {

	public static void main(String[] args) {
		//write a code to display count number of odd numbers bet 1 to 20
		
		int i=1;
		int count=0;
		
		while(i<=20)
		{
			if(i%2!=0)
			
			count=count+1;
			i++;
		}
		
		System.out.println(count);

	}

}
