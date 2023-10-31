package com.inheritance;

public class Account8 {

	private int accNo;
	private String name;
	
	public Account8()
	{
		accNo=0;
		name="";
	}
	public Account8(int accNo,String name)
	{
		System.out.println("parametric constructor of Account8");
		this.accNo=accNo;
		this.name=name;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		return "Account No : "+accNo+"Account Name  : "+name;
	}
	public static void main(String[] args) {
		
		
		
		
		
		
		

	}

}
