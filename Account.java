import java.lang.*;

public class Account{ 

private String name;
private double amount;


//running empty constructor
public Account(){
	System.out.println("E-constructor");
}
public Account(String name , double amount){
	this.name=name;
	this.amount=amount;
	
	
}
public void setname(String name){
this.name=name;
}


public void setamount(double amount){
this.amount=amount;
}

public void deposit(double money) {
	if(money>500&&amount+money>=10000){
	System.out.println("Deposite succesfull");
	amount = amount + money;}
	else
		System.out.println("Deposite unsuccessfull");
	
}
public void withdraw(double money){
	if(money >=1000 && (amount - money )<=500){
	System.out.println("Withdraw Successfull");
	amount = amount - money;}
	else 
		System.out.println("Withdraw unsuccessfull");
}
public void transfer(Account a ,double money){
	if( money>500&& money<=20000 )
		
	{this.amount= this.amount-money;
     a.amount=a.amount + money;	
	}
	else 
		System.out.println("Transfer unsuccessfull");
		
}

public double getamount(){
	
	return amount;
}


public void display(){
	System.out.println("---------------------------");
System.out.println("Name           :"+name);
System.out.println("Amount         :"+amount);      
System.out.println("-------------------------------");
}
//using run.java to run
}