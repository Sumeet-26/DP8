package com.inheritance;

public class Manager1 extends Employee1 {

	private int noofemp;
	private double bonus;
	
	public Manager1()
	{
		System.out.println("Default Constructor of Manager1");
		noofemp=0;
		bonus=0;
		
	}
	public Manager1(int eid,String name,double salary,MyDate1 d,int noofemp,double bonus)
	{
		super(eid, name, salary, d);
		System.out.println("Para const of Manager1");
		this.noofemp=noofemp;
		this.bonus=bonus;
	}
	public int getNoofemp() {
		return noofemp;
	}
	public void setNoofemp(int noofemp) {
		this.noofemp = noofemp;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public String toString()
	{
		return super.toString()+"No of Emp "+noofemp+" Bonus "+bonus;
	}
	public static void main(String[] args) {
		
	}

}
