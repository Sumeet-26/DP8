package com.oops;

public class Product {

	int productid,quantity;
	String productname,productd,productcategory;
	float discount,price,totalprice,totaldiscount,discountedprice;
	
	public void setData(int pid,String pname,String pdes,String pcat,float pdisc,float pprice,int pquant) 
	{
		
		productid=pid;
		productname=pname;
		productd=pdes;
		productcategory=pcat;
		discount=pdisc;
		price=pprice;
		quantity=pquant;
		
	}
	
	public void calculateTotalPrice() 
	{
		totalprice=price*quantity;		
	}
	public void calculateDiscount()
	{
	    totaldiscount=(totalprice*discount)/100;
	}
	public void discountedPrice()
	{
		discountedprice=totalprice-totaldiscount;
	}
	public void displayData() 
	{
		System.out.println("Product id "+productid);
		System.out.println("Product name "+productname);
		System.out.println("Product Discription "+productd);
		System.out.println("Product Category "+productcategory);
		System.out.println("Product Price "+price);
		System.out.println("Product Quantity "+quantity);
		System.out.println("Product Total Price "+totalprice);
		System.out.println("Product Discount "+discount);
		System.out.println("Product Discounted price "+discountedprice);
		System.out.println("--------++++++++----------+++++++++");
	}
	
	public static void main(String[] args) {
		
		Product obj=new Product();
		obj.setData(1, "Maggi", "food", "veg", 20, 20, 12);
		obj.calculateTotalPrice();
		obj.calculateDiscount();
		obj.discountedPrice();
		obj.displayData();
	}

}
