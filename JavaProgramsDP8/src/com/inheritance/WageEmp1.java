package com.inheritance;

public class WageEmp1 extends Employee1{
	private double hrs;
	private double rate;
	
	public WageEmp1()
	{
	  hrs=0;
	  rate=0;
	}
	
	public WageEmp1(int eid,String name,double salary,MyDate1 d,double hrs,double rate)
	{
		super(eid,name,salary,d);
		this.hrs=hrs;
		this.rate=rate;
		
	}
	public double getHrs() {
		return hrs;
	}

	public void setHrs(double hrs) {
		this.hrs = hrs;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public double calculateSalary()
	{
		double s=super.getSalary()+hrs*rate;
		super.setSalary(s);
		return s;
		
	}
	public String toString() {
		return super.toString()+"Time : "+hrs+" Rate"+rate;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
