package com.Containment;

public class Bank {

	private String bankName,address,ifsccode;
	private Account acc; 
	
	public Bank()
	{
		bankName="";
		address="";
		ifsccode="";
		acc=new Account();
	}
	public Bank(String bankName,String address,String ifsccode,Account a)
	{
		this.bankName=bankName;
		this.address=address;
		this.ifsccode=ifsccode;
		this.acc=a;
	}
	 public void setBankName(String bankname)
	 {
		 this.bankName=bankName;
	 }
	public void setAddress(String address)
	{
		this.address=address;
	}
	public void setIfscCode(String ifsccode)
	{
		this.ifsccode=ifsccode;
	}
	public void setAccountNo(Account acc)
	{
		this.acc=acc;
	}
	public String getBankName()
	{
		return bankName;
	}
	public String getAddress()
	{
		return address;
	}
	public String getIfscCode() 
	{
		return ifsccode;
	}
	public Account getAccountNo() 
	{
		return acc;
	}
	
	public String toString()
	{
		return "Bank Name "+bankName+"\n Bank Adress "+address+"\n Bank IFSC Code "+ifsccode+"\n Bank Account "+acc +"\n";
	}
	public static void main(String[] args)
	{
		Account d=new Account (1,"Sumit",55000);
		Bank obj=new Bank("IDBI","PUNE","IBKL89213",d);
		System.out.println(obj);
		
		Bank obj1=new Bank ("IDBI","Pune","IBKL1234",new Account (2,"Abhi",55301));
		System.out.println(obj1);
		
		
		
		
	}

}
