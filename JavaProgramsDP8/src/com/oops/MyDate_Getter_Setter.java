package com.oops;

public class MyDate_Getter_Setter {

	private int dd,mm,yy;
	public void setDd(int d)
	{
		dd=d;
	}
	public int getDd()
	{
		return dd;
	}
	public void setMm(int m)
	{
		mm=m;
	}
	public int getMm()
	{
		return mm;
	}
	public void setYy(int y)
	{
		yy=y;
	}
	public int getYy() 
	{
		return yy;
	}	
	
	public void setData(int d,int m,int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public void printDate() 
	{
		System.out.println("date is "+dd+"/"+mm+"/"+yy);
	}
	public static void main(String[] args)
	{
		MyDate_Getter_Setter obj=new MyDate_Getter_Setter();
		obj.setDd(17);
		obj.setMm(10);
		obj.setYy(2023);
		obj.printDate();
     }

}
