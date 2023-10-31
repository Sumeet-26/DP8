package com.oops;

public class MyDateConstructor {

	private int dd,mm,yy;
	
	public MyDateConstructor()
	{
		System.out.println("I am default Constructor");
		dd=17;
		mm=10;
		yy=2023;
	}
	public MyDateConstructor(int d,int m,int y) 
	{
		System.out.println("I am Parametrized Constructor");
		dd=d;
		mm=m;
		yy=y;
	}
	public void setData(int d,int m,int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
    public void printData()
    {
    	System.out.println("date is "+dd+"/"+mm+"/"+yy);
    }
    
	public static void main(String[] args)
	{
	
		 MyDateConstructor obj=new MyDateConstructor(18,10,2023);
		 MyDateConstructor obj1=new  MyDateConstructor();
		 obj.printData();
		 obj1.printData();
	}

}
