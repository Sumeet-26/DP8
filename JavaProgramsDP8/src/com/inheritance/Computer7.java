package com.inheritance;

 public class Computer7 extends ElectronicDevice{

	private int ram;
	private int ssd;
	private String processor;
	
	public Computer7 ()
	{
		System.out.println("Default const. of computer7");
		ram=0;
		ssd=0;
		processor="";
	}
	public Computer7(int deviceno,String deviceName,String os,MyDate7 dom,double price,int ram,int ssd,String processor) {
		super(deviceno,deviceName,os,dom,price);
		System.out.println("para const. of computer7");
		this.ram=ram;
		this.ssd=ssd;
		this.processor=processor;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getSsd() {
		return ssd;
	}
	public void setSsd(int ssd) {
		this.ssd = ssd;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String toString()
	{
		return super.toString()+"Computer ram : "+ram+"SSD : "+ssd+"Processor : "+processor;
	}
	public static void main(String[] args) {
		
		Computer7 obj=new Computer7(01,"HP","Windows",new MyDate7 (25,10,23),50000,8,512,"Ryzen 5");
		 System.out.println(obj);
		
		
		
	}

}
