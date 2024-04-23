import java.lang.*;

public class Account
{
	private int ano; 
	private double balance;
	
	public Account()
	{
		System.out.println("Empty Account");
	}
	public Account(int ano, double balance)
	{
		
		System.out.println("Param. Account");
		this.ano = ano;
		this.balance = balance;
	}
	public void setAno(int ano)
	{
		this.ano = ano;
	}
	public void setBalance(double balance)
	{
		if(balance>=0) //-500 >= 0
		{
			this.balance = balance;
		}
		else
		{
			System.out.println("Hobena!");
		}
		
	}
	public int getAno()
	{
		return ano;
	}
	public double getBalance()
	{
		return balance;
	}
	public void display()
	{
		System.out.println("ANO: "+ano);
		System.out.println("Balance: "+balance);
	}
	
	public void deposit(double amount)
	{
		if(amount>0 && (balance+amount)<=3000)
		{
			balance = balance + amount;
			System.out.println("Deposit Successful!");
		}
		else
		{
			System.out.println("Deposit Operation Failed!");
		}
	}
	public void withdraw(double amount)
	{
		if(amount>0 && (balance-amount)>=500)
		{
			balance = balance - amount;
			System.out.println("Withdraw Successful!");
		}
		else
		{
			System.out.println("Withdraw Operation Failed!");
		}
	}
	
	public void transfer(Account a, double amount)
	{
		this.balance = this.balance - amount;
		a.balance = a.balance + amount;
	}
	
}