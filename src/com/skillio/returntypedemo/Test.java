package com.skillio.returntypedemo;
/*
public class Test {
	public Account getAccount()
	{
		return new Account();
	}

	public static void main(String[] args)
	{
         Test t=new Test();
       //  Account a=new Account();
         //Account kalpna =new Account();
         Account kalpna=t.getAccount();
      //   Account kalpna=a.getAccount();
}
}*/
//to get details 1 by 1
/*
public class Test {
	
	public static void main(String[] args)
	{
         Test t=new Test();
      Account a=new Account();
        
      Account kalpna=a.getAccount();
      System.out.println(kalpna.accNo);
      System.out.println("Welcome "+ a.getAccName());
}
}
*/
/*
public class Test
{
	public static void main(String[] args)
	{
		Account a= new Account(12234,"kalpna",500.0f);// new Account() is object
		a.balance=a.balance-50;
		System.out.println(a.balance);
		
		Account b=new Account(1246,"kalp",456.2f);
		
		System.out.println(b.balance);
	}
}
*/

public class Test{
	public static void main(String[] args)
	{
		Account a=new Account();
		System.out.println(a.accno);
		System.out.println(a.name);
	
		
	}
}
