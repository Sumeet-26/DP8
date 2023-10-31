package com.oops;
import java.util.*;
public class ElectricityBill {

	String meterno,custmorId,customername,customerEmail,month;
	double units,bill,totalbill;
	
	public void setData(String metno,String ID,String name,String email,String mont)
	{
		 meterno=metno;
		 custmorId=ID;
		 customername=name;
		 customerEmail=email;
		 month=mont;
		 
	}
	
	public void calculateBill(double unit)
	{
		units=unit;
		if(units<=50)
		{
			bill=(0.5*units);
			totalbill=bill+(0.2*bill);
			System.out.println("Total bill is "+totalbill);
		}
		else if(units<=150)
		{
			bill=(0.5*50)+(0.75*(units-50));
			totalbill=bill+(0.2*bill);
			System.out.println("Total bill is "+totalbill);
		}
		else if (units<=250) {
			bill=(0.5*50)+(0.75*100)+(1.20*100)+(1.20*(units-150));
		   totalbill=bill+(0.2*bill);
		   System.out.println("Total bill is "+totalbill);
		}  else
		   
			   bill=(0.5+50)+(0.75*100)+(1.20*(units-250));
		      totalbill=bill+(0.2*bill);
		      System.out.println("Total bill is "+totalbill);
		
	}
	public void displayData()
	{
		System.out.println("Enter meter no "+meterno);
		System.out.println("Enter Customer ID "+  custmorId);
		System.out.println("Enter Customer name "+customername);
		System.out.println("Enter customer Email "+customerEmail);
		System.out.println("Enter month "+month);
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ElectricityBill obj=new ElectricityBill();
		obj.setData("A-12", "1", "Yogesh", "Yogesh@gmail.com", "Feb");
		obj.displayData();
		System.out.println("Enter no of units consumed");
		double unit=sc.nextDouble();
		obj.calculateBill(unit);
		
		
		
		
		
		
		
		
		
		
		

	}

}
