package com.loops;
import java.util.*;
public class CountOfDigit_While {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		int count=0;
		
		while (num > 0)                                      //logic ---->	                                                              //                     num                                                       count(0)
		{                                                                //                     587/10--we get single value               increse count by 1
			num=num/10;                                   //                          divided by 10                                             2
			++count;                                            //                           divided by 10                                             3
		}                                                              //                                   0 > 0 condition gets false
		System.out.println(count);
		
		
		
		
		
		
		
		
		
		
	}

}
