package com.skillio.returntypedemo;
/*
public class Account {
	   int accNo=789945;
	   String accName="Kalpna";
	   float balance=376.50f;
	   String ifsc="citi1234";
}
*/
//to get details 1 by 1
/*
public class Account {
   int accNo=789945;
   String accName="Kalpna";
   float balance=376.50f;
   String ifsc="citi1234";
   
   // to print welcome msg
   public String getAccName()
   {
	   return accName;
   }
   public Account getAccount()
	{
		return new Account();
	}
}
*/
/*
public class Account
{
	int accno;
	String name;
	float balance;
	String ifsc;
	
	public Account()   //no argument constructor
	{
		//System.out.println("I am no argument");
		accno=123456;
		name="kalpna";
		balance=1.456f;
		ifsc="citi456";
		
	}
	
	public Account(int accountno,String nme,float balc)// parameterized
	{
		accno=accountno;
		name=nme;
		balance=balc;
	}
}
*/

public class Account
{
	int accno;
	String name;
	float balance;
	String ifsc;
	
	public Account()
	{
		accno=1234;// reinitialization so it will print
		//accno=1234; if it is not there so block value will print
	}
	
	{
		//accno=4567;
		name="kalpna";
	}
	//default con for object
	/*
	public Account{
		super();//call to contructor
	}
	*/
	
	/*public class Account
	{
		int accno;
		String name;
		float balance;
		String ifsc;
		
		public Account()
		{
			accno=1234;// reinitialization so it will print
			//accno=1234; if it is not there so block value will print
		}
		
		{
			//accno=4567;
			name="kalpna";
		}
		*/
}