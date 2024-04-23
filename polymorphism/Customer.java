import java.lang.*;
public class Customer
{
	private String cusName;
	private int cusID;
	private Account acc[];
	
	
	public Customer()
	{
		
	}
	public Customer(String cusName, int cusID, int count)
	{
		this.cusName=cusName;
		this.cusID = cusID;
		acc = new Account[count];
	}
	public void setName(String cusName)
	{
		this.cusName = cusName;
	}
	public void setID(int cusID)
	{
		this.cusID = cusID;
	}
	public void setAcc(int count)
	{
		acc = new Account[count];
	}
	public String getName()
	{
		return cusName;
	}
	public int getID()
	{
		return cusID;
	}
	public void addAccount(Account a)
	{
		int check = 0;
		for(int i=0; i<acc.length; i++)
		{
			if(acc[i] == null)
			{
				acc[i] = a;
				check = 1;
				break;
			}
		}
		if(check == 1)
		{
			System.out.println("Account added!");
		}
		else
		{
			System.out.println("Account not added!");
		}
	}
	public void deleteAccount(Account a)
	{
		int check = 0;
		for(int i=0; i<acc.length; i++)
		{
			if(acc[i] == a)
			{
				acc[i] = null;
				check = 1;
				break;
			}
		}
		if(check == 1)
		{
			System.out.println("Account deleted!");
		}
		else
		{
			System.out.println("Account not deleted!");
		}
	}
	public void searchAccount(Account a)
	{
		int check = 0;
		for(int i=0; i<acc.length; i++)
		{
			if(acc[i] == a)
			{
				check = 1;
				break;
			}
		}
		if(check == 1)
		{
			System.out.println("Account found!");
		}
		else
		{
			System.out.println("Account not found!");
		}
	}
	public void display()
	{
		System.out.println("Customer Name: "+cusName);
		System.out.println("Customer ID: "+cusID);
		System.out.println("Customer Account Details: ");
		for(int i=0; i<acc.length; i++)
		{
			if(acc[i]!=null)
			{
				acc[i].display();
			}
			else
			{
				System.out.println("This Account is closed");
			}
			
		}
	}
	/*public void performDeposit(double amount)
	{
		acc.deposit(amount);
	}
	public void performTransfer(Customer c, double amount)
	{
		acc.transfer(c.acc, amount);
	}*/
	
	
}