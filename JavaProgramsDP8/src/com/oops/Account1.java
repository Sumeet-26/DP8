package com.oops;
// getter setter use
public class Account1 {

	// data member
	private int accNo;
	private String ownerName;
	private double balance;
	
	public void setAccNo(int acc)
	{
		accNo=acc;
	}
	public int getAccno()
	{
		return accNo;
	}
	public void setOwnerName(String on)
	{
		ownerName=on;
	}
	public String getOwnername()
	{
		return ownerName;
	}
	public void setBalance(double b)
	{
		balance=b;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public void setData(int acc,String on,double b)
	{
		accNo=acc;
		ownerName=on;
		balance=b;
		
	}
	public void displayData()
	{
		System.out.println("Account name is "+accNo);
		System.out.println("Owner name is "+ownerName);
		System.out.println("Account balance is "+balance);
	}
	public static void main(String[] args) {
		Account1 obj=new Account1 ();
		obj.setAccNo(1);
		obj.setOwnerName("Sumit");
		obj.setBalance(750000);
		obj.displayData();
		
		obj.setData(2, "yogesh", 10000);
         obj.displayData();
         double d=obj.getBalance();
         System.out.println(d);
        String s= obj.getOwnername();
		System.out.println(s);
	}

}
