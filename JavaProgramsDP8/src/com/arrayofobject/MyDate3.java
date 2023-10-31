package com.arrayofobject;
/*
 * 3.	Create class Dept(did, dname), class MyDate(day, month, year)
		a.	Class Employee(emp_id, emp_name, salary, date(object), dept(object)). 
		Create array of Employee and display the array elements.
4.	Same as above but print Employees whose dept_name is same.

 */
public class MyDate3 {
    private int dd,mm,yy;
	
	
	public MyDate3() {
		
	  System.out.println("I am in Default Constructor of MyDate3");
	   dd=17;
	   mm=10;
	   yy=2023;
	}
	public MyDate3(int dd,int mm,int yy)
	{
		System.out.println("I am in parametrized Constructor of MyDate3");
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	public void setData(int d,int m,int y) {
		dd=d;
		mm=m;
		yy=y;
	}
	
		public String toString()
		{
			return "Date of joining : "+dd+"/"+mm+"/"+yy;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
