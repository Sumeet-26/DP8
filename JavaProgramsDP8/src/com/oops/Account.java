package com.oops;

import java.util.Scanner;

public class Account {
	int ac_number;
	String ac_name,branch_name,ifsc_code;
	double balance,deposit,withdraw,new_balance;
	
	public void setData(int num,String acname,String bname,String ifsccode,double balanc,double depo,double withd) 
	{
		ac_number=num;
		ac_name=acname;
		branch_name=bname;
		ifsc_code=ifsccode;
		balance=balanc;
		deposit=depo;
		withdraw=withd;	
	}
	
	public void depositeAmount(double depo)
	{   
		deposit=depo;
		balance=balance+deposit;
		
	}
	public void withdrawAmount(double draw) 
	{
		withdraw=draw;
		balance=balance-withdraw;	
	}
	
	public void displayData() 
	{
		System.out.println("Account Number "+ac_number);
		System.out.println("Account name "+ac_name);
		System.out.println("Branch name "+branch_name);
		System.out.println("Ifsc code "+ifsc_code);
		System.out.println("Balance is "+balance);
		System.out.println("Deposite "+deposit);
		System.out.println("Withdraw "+withdraw);
		System.out.println("New balance "+balance);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		 Account obj=new  Account ();
		 
		 obj.setData(12345, "Sumit ", "Pune", "1234SD",10000, 5000, 3000);
		 
		 System.out.println("Enter deposite amount");
		 double depo=sc.nextDouble();
		obj.depositeAmount(depo);
		System.out.println("Enter withdraw amount");
		double draw=sc.nextDouble();
		obj.withdrawAmount(draw);
		obj.displayData();
		
	}

}
