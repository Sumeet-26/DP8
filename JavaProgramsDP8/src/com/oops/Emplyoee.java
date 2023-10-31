package com.oops;

public class Emplyoee {

	int eid;
	String ename,email;
	float basicsalary,pf,hra,da,netsal;
	
	public void setData(int empid,String empName,String emailId,float salary) {
		eid=empid;
		ename=empName;
		email=emailId;
		basicsalary=salary;	
	}
	public void displayData() {
		
		System.out.println("Employee Id "+eid);
		System.out.println("Employee name "+ename);
		System.out.println("Employee Email "+email);
		System.out.println("Employy salary "+basicsalary);
		System.out.println("Pf of employee "+pf);
		System.out.println("da of employee "+da);
		System.out.println("hra of employee "+hra);
		System.out.println("Netsalary of employee "+netsal);
	}
	
	public void findPf()
	{
		pf=basicsalary*0.10f;	
	}
	public void findDa() {
		da=(float)basicsalary*0.20f;
	}
	public void findHra()
	{
		hra=(float)basicsalary*0.15f;
	}
	public void netsalary() 
	{
		netsal=(float)basicsalary-(pf+da+hra);
	}
	
	public static void main(String[] args) {
	
		Emplyoee obj=new Emplyoee();
		obj.setData(1, "Sumit", "Sumit@gmail.com", 55800f);
		
		obj.findPf();
		obj.findDa();
		obj.findHra();
		obj.netsalary();
		obj.displayData();
	}

}
