package com.Containment;

public class BankArrayDemo {

	int branchCode;
	String bankName;
	String address;
	Account account[];// array of account 
	public BankArrayDemo()
	{
	
	}
	public BankArrayDemo(int branchCode, String bankName, String address, Account account[]) {
		
		this.branchCode = branchCode;
		this.bankName = bankName;
		this.address = address;
		this.account = account;
	}
    
	public int getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Account[] getAccount() {
		return account;
	}

	public void setAccount(Account account[]) {
		this.account = account;
	}
    
	@Override
	public String toString() {
		return "Bank [branchCode=" + branchCode + ", bankName=" + bankName + ", address=" + address ;
				
	}

    public void printAccount()
    {
    	for(Account a:account)
    		System.out.println(a);
    }
	public static void main(String[] args) 
	{
		Account accArr[]=new Account[3];
		accArr[0]=new Account(101, "Arti", 89000);
		accArr[1]=new Account(670, "pooja", 65000);
		accArr[2]=new Account(456, "Leena", 45000);
		
		BankArrayDemo obj=new BankArrayDemo(1001,"Deccan", "pune",accArr );//we simply create array of acc so dont need to create object of class every time to add 
		//acc holder details in object.
		System.out.println(obj);
		obj.printAccount();
		
	}

}
