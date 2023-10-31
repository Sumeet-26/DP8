package com.constructor;
/*Create a class Account with member Variable: long accountNo, String customerName.Make them public.
2. In main, create a new object of the Account class and print the member variables value.
Note – Default constructor is provided by Java to facilitate the creation of a new object. 
Here variables are assigned default values
*/

public class Account2 {
	
	public long accountNo2;
	public String customerName;
	
	Account2(long accountNo2,String customerName)
	{
		this.accountNo2=accountNo2;
		this.customerName=customerName;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Account2 obj=new Account2(1258,"Sumit");
            System.out.println(obj.accountNo2);
            System.out.println(obj.customerName);
           
	}

}
