package com.methoduse;

import java.util.Scanner;

// 3,9,10,30,31,93.......
public class Problem5 {

	public static void series(int n)
	{
		int num=3;
		System.out.println(num);
		
		for(int i=1;i<=n; i++) {
			
		      int num2=num*3;
		      
		      int num3=num2+1;
		      System.out.println(num2);
		      System.out.println(num3);
		      num=num3;
		}
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc =new Scanner(System.in);
          System.out.println("Enter number");
          int n=sc.nextInt();
		
		Problem5.series(n);
		

	}

}
