package com.basic;

public class Operator2 {

	public static void main(String[] args) {
		
		int i=5;
		int n=i++%5;
		System.out.println(n);
		
		int m=++i%5;
		System.out.println(i+" "+i);
		System.out.println(m);
		
		int a= 5 ,b = 4 , c = 3 ;
		int d;
		//System.out.println(a++ + b * ++c);
		//System.out.println("a = " + a + " b= " + b + " c = " + c);
		//System.out.println(b*5/a + b++ + b);
		//System.out.println("a = " + a + " b= " + b + " c = " + c);
		d=a++ +b*++c;
		System.out.println(a+" "+b+" "+c);
		System.out.println(d);	
	}

}
