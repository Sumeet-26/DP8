package com.override;

/*3)WAP to create class Vehicle with methods accelerate(long mph) with long type parameter ,stop(),run() 
 * all method return string type of value. 
 * Create class car which extends Vehicle implement accelerate(long mph)differently in car class.*/
public class Vehicle {

	public void accelerate(long mph) {
		System.out.println("Acclerate");
	}

	public void stop(long mph) {
		System.out.println("stop");
	}

	public void run(long mph) {
		System.out.println("run");
	}

	public static void main(String[] args) {

		Vehicle obj = new Vehicle();
		obj.accelerate(200);
		Car c = new Car();
		c.accelerate(100);
	}

}

class Car extends Vehicle {

	public void accelerate(long mph) {
		System.out.println("Acclerate in car");
	}
}
