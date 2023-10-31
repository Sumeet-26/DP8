package com.inheritance;

	public class SalesPerson1 extends WageEmp1{

	private int sales;
	private double comm;
	
	public SalesPerson1() {
		super();
		sales=0;
		comm=0.0;
	}
	 public SalesPerson1(int eid,String name,double salary,MyDate1 d,double hrs,double rate,int sales,double comm)
	 {
		 super(eid,name,salary,d,hrs,rate);
		 System.out.println("Parameter constructor of SalesPerson1 ");
		 this.sales=sales;
		 this.comm=comm;	 
	 }

	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public double calculateSalary()
	{
		double s=super.calculateSalary()+sales*comm;
		super.setSalary(s);
		return s;
	}
	public String toString()
	{
		return super.toString()+"Sales : "+sales+"Commission : "+comm;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
