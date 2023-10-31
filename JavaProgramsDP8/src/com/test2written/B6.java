package com.test2written;

public class B6 extends A6{

	static
	{
		i=--i - i--;
	}

	public static void main(String[] args) {
		B6 b=new B6();
		System.out.println(b.i);
		
	}

}
