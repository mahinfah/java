import java.lang.*;


public class Start
{
	public static void main(String[] args)
	{
		Account a1 = new SavingsAccount(101, 1500, 3);
		Account a2 = new CurrentAccount(201, 1600, 10);
		Account a3 = new SavingsAccount(102, 1700, 5);
		Account a4 = new CurrentAccount(202, 1900, 15);
		
		/*Customer c1 = new Customer("Bruce", 501, a1);
		Customer c2 = new Customer("Lee", 502, a2);
		c1.display();
		c1.performDeposit(500);
		c1.display();
		c1.performTransfer(c2, 500);
		c1.display();
		c2.display();*/
		
		Customer c1 = new Customer("Bruce", 501, 3);
		Customer c2 = new Customer("Lee", 502, 2);
		
		c1.addAccount(a1);
		c1.addAccount(a2);
		c1.addAccount(a3);
		
		c1.display();
		
		c1.deleteAccount(a2);
		c1.searchAccount(a3);
		c1.display();
		
		c2.addAccount(a4);
		c2.display();
		
	}
}
