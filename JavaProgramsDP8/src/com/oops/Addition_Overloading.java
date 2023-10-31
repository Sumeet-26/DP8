package com.oops;

public class Addition_Overloading {

	public void add (int i,int j)
	{
		System.out.println("Addition (int,int) is  :"+(i+j));
	}
	public void add (float f1,float f2)
	{
		System.out.println("Addition (float,float) is  :"+(f1+f2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition_Overloading obj=new Addition_Overloading();
		obj.add(10, 90);
		obj.add(5.5f, 10.5f);
		
		
		
		
	}

}
