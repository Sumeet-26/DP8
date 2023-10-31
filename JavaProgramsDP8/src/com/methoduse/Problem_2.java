package com.methoduse;
// 1,3,7,15,31,63,126........
import java.util.Scanner;

public class Problem_2 {

	public void series(int n)
	{
		System.out.println("1 ");
		int temp=0;
		int num=1;
		for(int i=2; i<=n; i++)
		{
			temp=(num+num)+1;
			num=temp;
			System.out.println(temp+" ");
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter terms");
		  int n=sc.nextInt();
		  Problem_2 obj=new Problem_2 ();
		  obj.series(n);
		
	}

}
