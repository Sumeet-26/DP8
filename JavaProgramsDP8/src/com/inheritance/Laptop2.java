package com.inheritance;
/*4. Create Class Laptop which has variables noOfUSBPort, processorSpeed of 
type int. Create getter, setter methods for the variables. In main method, 
1> create Laptop object 2> set values of variables noOfUSBPort, 
processorSpeed using setter methods. 3> print variables noOfUSBPort, 
processorSpeed using getter methods*/
public class Laptop2 {

	
	private int noOfUSBport;
	private int processorSpeed;
	
	public Laptop2()
	{
		noOfUSBport=0;
		processorSpeed=0;
	}
	public Laptop2(int noOfUSBport,int processorSpeed)
	{
		this.noOfUSBport=noOfUSBport;
		this.processorSpeed=processorSpeed;
		
	}
	public int getNoOfUSBport() {
		return noOfUSBport;
	}
	public void setNoOfUSBport(int noOfUSBport) {
		this.noOfUSBport = noOfUSBport;
	}
	public int getProcessorSpeed() {
		return processorSpeed;
	}
	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}
	public static void main(String[] args) {
		
		Laptop2 obj=new Laptop2();
		obj.setNoOfUSBport(5);
		obj.setProcessorSpeed(2);
		System.out.println("No of USB ports : "+obj.getNoOfUSBport());
        System.out.println("Processor Speed : "+obj.getProcessorSpeed());
	}

}
