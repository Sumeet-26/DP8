package com.methoduse;

public class Series_Using_Method {
	//write a code to display series to 10th term
	//1,4,9,16,25........
	public void terms()
	{
		
		int i;
		int square;
		for ( i=1;  i<=10;  i++)
		{
			square=i*i;
			System.out.println(square+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		Series_Using_Method obj=new Series_Using_Method ();
		obj.terms();
		
	}

}
