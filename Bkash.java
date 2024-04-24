import java.lang.*;


public class Bkash
{
	private String name ;
	private double amount;
	
	public void setname(String name){
		this.name = name;
	}
	public void setamount(double amount){
	this.amount = amount;  
	
	}
	public void transfer(Bkash a ,double amount){
		
		this.amount = this.amount - amount ;
		a . amount = a.amount + amount;
		
		
	}
	public String getname(){
	return name ;}
	public double getamount (){
	return amount ;}
	
		public void display(){
		
		System.out.println("name :"+name);
	    System.out.println("amount :"+amount);	
		
	}
	
}
