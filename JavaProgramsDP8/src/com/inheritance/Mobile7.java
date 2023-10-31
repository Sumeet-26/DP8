package com.inheritance;

public class Mobile7 extends ElectronicDevice {
	private String model;
	private int ram;
	private int memory;
	private double discount;
	
	public Mobile7()
	{
		System.out.println("Default const.of mobile7");
		model="";
		ram=0;
		memory=0;
		discount=0.0;
	}
	public Mobile7(int deviceno,String deviceName,String os,MyDate7 dom,double price,String model,int ram,int memory,double discount)
	{
		super(deviceno,deviceName,os,dom,price);
		this.model=model;
		this.ram=ram;
		this.memory=memory;
		this.discount=discount;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double calculatePrice() {
		double p= super.getPrice()*(1+(discount/100));
		super.setPrice(p);
		return p;
		
	}
		public String toString()
		{
			return super.toString()+" Model : " + model +" RAM : " + ram +" Memory : " + memory	+" Discount : "+ discount;
		
		}
	public static void main(String[] args) {
		
		Mobile7 obj=new Mobile7(1,"MobilePhone","Android",new MyDate7(25,10,2022),40000,"Samsung",4,128,12);
		obj.calculatePrice();
		System.out.println(obj);
		
		
		
		
		
		
		
	}

}
