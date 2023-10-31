package com.oops;
//Write a method multiply(),in a class Arithmatic ,overload multiply() method 4 times by passing paramerters of diff types
public class Airthmatic {

	public void multiply(int a,int b)
	{
		System.out.println("Multiplication is "+a*b);
	}
	
	public void multiply(int a,int b,int c)
	{
		System.out.println("Multiplication is "+a*b*c);
	}
	public void multiply(float a,int b)
	{
		System.out.println("Multiplication is "+a*b);
	}
	public void multiply(double a, double b)
	{
		System.out.println("Multiplication is "+a*b);
	}
	public static void main(String[] args) {
        Airthmatic obj=new Airthmatic();
        obj.multiply(20, 40);
        obj.multiply(45, 50, 89);
        obj.multiply(54.47f, 47);
        obj.multiply(23.145, 8513.12);
	}

}
