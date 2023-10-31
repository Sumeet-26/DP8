package com.constructor;
/*. Design a class to overload a function compare( ) as follows:
(a) void compare (int, int) – to compare two integer values and print the greater of the two integers.
(b) void compare (char,char) – to compare the numeric value of two characters and print the character with higher numeric value.
*/

public class Assign11 {

	
     public void compare(int a ,int b)
     {
    	 if (a>b)
    	 {
    		 System.out.println("The greater number is "+a);
    	 }
    	 else if(b>a)
    	 {
    		 System.out.println("The greater number is "+b);
    	 }
    	 else
    		 System.out.println("Both are equal numbers");
     }
     public void compare(char a,char b)
     {
    	 int num1=(int) a;
    	 int num2=(int) b;
    	 
    	 if(num1>num2)
    	 {
    		 System.out.println("Character with higher numeric value is "+num1);
    	 }
    	 else if (num2>num1)
    	 {
    		 System.out.println("Character with higher numeric value is "+num2);
    	 }
    	 else
    	System.out.println("both charcter have same numeric value");
    	 
    	 
     }

	public static void main(String[] args) {

		  Assign11  as=new Assign11();
		  as.compare(45, 70);
		  as.compare('A', 'Z');
				  


	}

}
