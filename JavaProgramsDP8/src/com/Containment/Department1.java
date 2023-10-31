package com.Containment;

public class Department1 {
	
	int deptid;
	String dname;

	Department1()
	{
		
	}
	Department1(int deptid,String dname)
	{
		this.deptid=deptid;
		this.dname=dname;
	}
	
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
