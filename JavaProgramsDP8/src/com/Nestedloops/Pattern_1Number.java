package com.Nestedloops;

public class Pattern_1Number {

	public static void main(String[] args) {
		
		//1
		//11
		//111
		//1111
		
		//row--------->4,(outer)    column---------->4(inner)
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" 1 ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
