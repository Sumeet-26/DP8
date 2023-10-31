package com.basic;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a=2;
		//int b=3;
		int z;
		
	//	z=++a + ++b + a-- - --b + a;
	//	System.out.println(a+" "+b+" "+a+" "+b+" "+a);
		//System.out.println(z);//9
		
		//z=a++ + b++ + ++b -a;
		//System.out.println(a+" "+b+" "+b+" "+a);
		//System.out.println(z);//7
		
		//z=--b + --a + a++ +b++ -b;
		//System.out.println(b+" "+a+" "+a+" "+b+" "+b);
	   // System.out.println(z);//3
		
		//z=--a- --b -b-- -b -a*2;
		//System.out.println(a+" "+b+" "+b+" "+b+" "+a);
		//System.out.println(z);//-6
		
		//int a=1;
		//int b=1;
		
	//	z=a++ + b++  - b-- - a-- - --a - --b;
		//System.out.println(a+" "+b+" "+b+" "+a+" "+a+" "+b);
		//System.out.println(z);//-2
		
	//	z=a-- -(a/2)- --a+a+ + ++b;
	//	System.out.println(a+" "+a+" "+a+" "+a+" "+b);
		
	//	System.out.println(z);//3
		
		int a=2;
		int b=2;
		int c=2;
		
		int x;
		x=c++ +a++ +b++;
		System.out.println(c+" "+a+" "+b);
		System.out.println(x);//6
		
		x=++a - ++b - ++c;
		System.out.println(a+" "+b+" "+c);
		System.out.println(x);//-4
		
		x=--a - b--  + c--;
		System.out.println(a+" "+b+" "+c);
		System.out.println(x);//3
		
		x=a++ - --b- ++c;
		  System.out.println(a+" "+b+" "+c);
		  System.out.println(x);//-3
		  
		  x=--a - --b - --c;
		  System.out.println(a+" "+b+" "+c);
		  System.out.println(x);//-1
		  
		
		  
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
