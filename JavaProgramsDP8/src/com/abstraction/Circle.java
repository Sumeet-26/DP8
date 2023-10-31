package com.abstraction;

public class Circle extends Shape {
	
	double pi=3.14;
	double r;
	public Circle (double r)
	{
		this.r=r;
	}
	
	public double calculateArea()
	{
		return pi*r*r;
	}
	public static void main(String[] args)
	{
		Circle c=new Circle(15.5);
		System.out.println(c.calculateArea());
		Shape arr[]=new Shape[3];
		arr[0]=new Circle(5.5);
		arr[1]=new Rectangle(10,25);
		arr[2]=new Square(7);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i].calculateArea());
		}
		
	}
	

}
