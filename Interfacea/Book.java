import java.lang.*;

public class Book implements IBookOperations
{   
      private int quantity;
	
	public Book ( int quantity)
	{
		this.quantity=quantity;
	}
	
	public Book()
	{
		System.out.println("EMpty cons");
	}
	
	public void setquantity(int quantity)
	{
		this.quantity= quantity;
	}
	public int getquantity()
	{
		return quantity;
	}
	public void addBook(int add)
    {
    quantity = 	quantity  + add ;
	
	}
	
	public void sellBook(int sell)
    {
	quantity = 	quantity  - sell ;
		
	}
	public void display()
	{
		//System.out.println("quantity  :"+ quantity);
		System.out.println("available books :"+quantity);
	    //System.out.println("available books");
	
	}


public static void main(String args [])
{
	
	Book b1 = new Book(20);
	b1.addBook(5);
	b1.sellBook(20);
	b1.display();
}
	
}
