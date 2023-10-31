package com.Interface;

public class A implements Printable{

	

	@Override
	public void print() 
	{
		System.out.println("Implement in class A");
		
	}	
	public static void main(String[] args) {
		
		A obj=new A();
		obj.print();
		
		
	}


}
