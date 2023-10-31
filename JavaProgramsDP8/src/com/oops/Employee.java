package com.oops;

public class Employee {

	// data members
	int eid;
	String ename, desg, dname, addr, email;
	long contactNo;
	double sal;
	boolean fulltimeStatus;

	public void setdata(int id, String name, String desig, String department, String address, String e, long c,
			double s, boolean fS)
	{
		eid = id;
		ename = name;
		desg = desig;
		dname = department;
		addr = address;
		email = e;
		contactNo = c;
		sal = s;
		fulltimeStatus = fS;
	}

	public void displayEmployye() {
		System.out.println("Employee id " + eid);
		System.out.println("Employye designation " + desg);
		System.out.println("Employye name " + dname);
		System.out.println("Employye address " + email);
		System.out.println("Employye contactno " + contactNo);
		System.out.println("Employee salary " + sal);
		System.out.println("Employye status " + fulltimeStatus);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj = new Employee();
		// System.out.println("Employee id "+obj.eid);
		// System.out.println("Employye designation "+obj.desg);
		// System.out.println("Employye name "+obj.dname);
		// System.out.println("Employye address "+obj.email);
		// System.out.println("Employye contactno"+obj.contactNo);
		// System.out.println("Employee salary"+obj.sal);
		// System.out.println("Employye status "+obj.fulltimeStatus);

		obj.setdata(101, "Sumit", "Manager", "Developer", "Pune", "Sumit@gmail.com", 8668656067l, 88000, true);
		obj.displayEmployye();
		
		Employee obj1=new Employee();
		obj1.setdata(102, "Shahid", "Actor", "Film", "Delhi", "Shahid@gmail", 2412262049l, 500000, false);
		obj1.displayEmployye();
	}

}
