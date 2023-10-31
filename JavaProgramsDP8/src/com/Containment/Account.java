package com.Containment;

public class Account {

	int accNo;
	String name;
	double balance;
	
	Account()
	{
		
	}
	Account(int accNo,String name,double balance)
	{
		this.accNo=accNo;
		this.name=name;
		this.balance=balance;
	}
	 public void setAccNo(int accNo)
	 {
		 this.accNo=accNo;
	 }
	public int getAccNo()
	{
		return accNo;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
	 public String toString() {
		 return "Account no :"+ accNo +"\t Account name : "+name+"\t Account Balance : "+balance;
	 }
	
	
	public static void main(String[] args) {
	
		Account obj=new Account (1,"Sumit",5000);
		System.out.println(obj);
		
		Account obj1=new Account();
		System.out.println(obj1);
		
		
		
		
	}

}
