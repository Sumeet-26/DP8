package com.inheritance;

public class Employee1 {

	private int eid;
	private String name;
	private double salary;
	private MyDate1 doj;
	
	public Employee1() 
	{    
		eid=0;
		name="";
		salary=0;
		doj=new MyDate1();
		
	}
	public Employee1(int eid,String name,double salary,MyDate1 d)
	{
		this.eid =eid;
		this.name=name;
		this.salary=salary;
		this.doj=d;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public MyDate1 getDoj() {
		return doj;
	}
	public void setDoj(MyDate1 doj) {
		this.doj = doj;
	}
	public String toString()
	{
		return "Emp ID  "+eid+"   Emp Name "+name+"  Salary   "+salary+"Date of joining "+doj;
	}
	public void printArray(Employee1 a[])
	{
		String str="";
		for(int i=0;i<a.length;i++)
		{
			if (a[i]   instanceof   SalesPerson1)
				str="Salesperson1";
			else if(a[i]  instanceof  WageEmp1)
				str="WageEmp1";
			else if (a[i]  instanceof  Manager1)
				str="Manager1";
			else
				str="Employee1";
			
			System.out.println(str);
			System.out.println(a[i]);
				
		}	
		
	}
	
	public static void main(String[] args)
	{
		Employee1 obj=new Employee1(01,"Yogesh",50000,new MyDate1 (25,10,2023));
		System.out.println(obj);

		System.out.println("_________________________________________________");
		
		Employee1 arr[]=new Employee1[4];
		arr[0]=new Employee1(01,"Sumit",50000,new MyDate1(25,10,2023));
		arr[1]=new Manager1(03,"Yogesh",50000,new MyDate1(25,10,2023),100,100.5);
		arr[2]=new SalesPerson1(01,"Amit",50000,new MyDate1(25,10,2023),100,50,10000,0.1);
		arr[3]=new WageEmp1(01,"Suraj",30000,new MyDate1(25,10,2023),200,10);
		
		Employee1 a=new Employee1();
		a.printArray(arr);
		
		
		
		
	}

}
