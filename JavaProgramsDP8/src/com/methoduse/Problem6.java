package com.methoduse;
// 5,9,17,29,45,..........
import java.util.Scanner;

public class Problem6 {

	public static void series(int n)
	{
		int a=5;
		for(int i=1;i<=n; i++)
		{
		int b=a+(i*4);
		a=b;
			System.out.println(b);
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		  Scanner sc =new Scanner(System.in);
          System.out.println("Enter number");
          int n=sc.nextInt();
		
          Problem6.series(n);
		
		
		
		
		
	}

}
