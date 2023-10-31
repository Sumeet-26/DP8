package com.inheritance;
	
	public class ElectronicDevice 
{
   private int deviceNo;
   private String deviceName;
   private String os;
   private MyDate7 dom;//date of manufacture
   private  double price;
	
		public ElectronicDevice()
		{
			deviceNo=0;
			deviceName="";
			 os=" ";
			 dom=new MyDate7 ();//date of manufacture
			 price=0;
		}
		public ElectronicDevice(int deviceno,String deviceName,String os,MyDate7 dom,double price)
		{
			this.deviceName=deviceName;
			this.deviceNo=deviceno;
			this.os=os;
			this.dom=dom;
			this.price=price;
		}
	    public void setDeviceName(String deviceName)
	    {
	    	this.deviceName=deviceName;
	    }
	    public void setDeviceNo(int deviceNo)
	    {
	    	this.deviceNo=deviceNo;
	    }
	    public void setOs(String os) {
	    	this.os=os;
	    }	
	     public void setDom(MyDate7 dom)
	     {
	    	 this.dom=dom;
	     }
	     public void setPrice(double price)
	     {
	    	 this.price=price;
	     }
	     public String getDeviceName()
	     {
	    	 return deviceName;
	     }
	     public String getOs()
	     {
	    	 return os;
	     }
	     public int getDeviceNo()
	     {
	    	 return deviceNo;
	     }
	      public double getPrice()
	      {
	    	  return price;
	      }
	       public MyDate7 getDom()
	       {
	    	   return dom;
	       }
	        public String toString()
	        {
	        	return "Electronic [ Device No : "+deviceNo+"Device Name "+deviceName+"Operating System : "+os+" Date of manufacturing  :"+dom+"Price  :"+price;
	        }
	
}
