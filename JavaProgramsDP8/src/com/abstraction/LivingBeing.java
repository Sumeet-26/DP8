package com.abstraction;

public class LivingBeing {

	public static void main(String[] args) {
	
		Animal obj=new Tiger();
		obj.eat();
		System.out.println(obj);
		Animal obj1=new Elephant();
		obj1.eat();
        System.out.println(obj1);
	}

}
