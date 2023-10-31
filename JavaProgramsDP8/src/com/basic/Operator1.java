package com.basic;

public class Operator1 {

	public static void main(String[] args) {
		
		int a=0;
		int b=0;
		int c=0;
		
		a=++a - --c +b++;
		System.out.println(a+" "+c+" "+b);
		System.out.println(a);
		
		a=--a +c++ + ++b;
		System.out.println(a+" "+c+" "+b);
		System.out.println(a);
		
		a=a++ +c-- - --b;
		System.out.println(a+" "+c+" "+b);
		System.out.println(a);
		
	}

}
