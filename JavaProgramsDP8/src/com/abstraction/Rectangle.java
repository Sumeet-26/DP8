package com.abstraction;

public class Rectangle extends Shape {
     double length;
     double breadth;
     
   public  Rectangle(double length,double breadth)
     {
    	 this.length=length;
    	 this.breadth=breadth;
     }
	public double calculateArea()
	{
		return length*breadth;
	}
	
	public static void main(String[] args) {
		
		Rectangle r=new Rectangle(12,30);
		System.out.println(r.calculateArea());
	}

}
