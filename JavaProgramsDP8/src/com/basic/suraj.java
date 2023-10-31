package com.basic;
import java.util.*;
public class suraj 
{
	//1,3,7,15,31,63,.........
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter valu of n");
		int n = Sc.nextInt();
		int num = 1;
		System.out.println(num);
		for (int i =0; i<=n;i++)
		{
			num= (num*2)+1;
			System.out.println(num);
		}
	}

}
