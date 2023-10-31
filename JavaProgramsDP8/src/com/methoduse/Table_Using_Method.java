package com.methoduse;

import java.util.*;

public class Table_Using_Method {

	public void table()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
		}		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Table_Using_Method obj=new Table_Using_Method();
		obj.table();
		
		
	}

}
