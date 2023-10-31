package com.inheritance;

public class TV7 extends ElectronicDevice {
	
	private String model;
    private int size;
    
    public TV7()
    {
    	model="";
    	size=0;
    }
    public TV7(int deviceno,String deviceName,String os,MyDate7 dom,double price,String model,int size)
    {
    	super(deviceno,deviceName,os,dom,price);
    	this.model=model;
    	this.size=size;
    }
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public static void main(String[] args) {
	
		

	}

}
