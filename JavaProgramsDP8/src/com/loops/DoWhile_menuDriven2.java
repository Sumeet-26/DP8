package com.loops;
import java.util.*;
public class DoWhile_menuDriven2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// write code to perform menu driven programm using do while & switch to calculate area of rectangle,circle,triangle
		//and square as per user choice
		Scanner sc=new Scanner(System.in);
		double length,breadth,radius,side,height,area,base;
		//double area;
		//double base;
		char ch;
		 do
		 {
			 System.out.println("1.area of rectangle\n2.area of triangle\n3.area of Square\n4.Area of circle");
			 System.out.println("Enter your choice from above menu");
			 int choice=sc.nextInt();
			 
			 switch(choice) 
			 {
			 case 1:
				 System.out.println("Enter length of rectangle");
			 length=sc.nextInt();
			 System.out.println("Enter breadth of rectangle");
			 breadth=sc.nextDouble();
			 area=length*breadth;
			 System.out.println("Area of rectangle "+area);
			 break;
			 
			 case 2: 
				 System.out.println("Enter base of Triangle");
	  	          base=sc.nextDouble();
	  	          System.out.println("Enter height of Triangle");
	  	          height=sc.nextDouble();
	  	          area=(base*height)/2;
	  	          System.out.println(area);
	  	          break; 
	  	          
			 case 3:
				 System.out.println("Enter the side of square");
				 side=sc.nextDouble();
				 area=side*side;
				 System.out.println("Area of square "+area);
	  	          break;
	  	          
			 case 4:
				 System.out.println("Enter radius of circle");
				 radius=sc.nextDouble();
	  	          area=3.14*radius*radius;
	  	          System.out.println("Area of circle "+area);
	  	          break; 
	  	          
	  	        default:System.out.println("Invalid choice");  
	  	          
			 }
			 System.out.println("Do you want to continue");
			 ch=sc.next().charAt(0);
			 
			 
			 
		 }while(ch=='y' ||ch=='Y');
		
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
