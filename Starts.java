import java.lang.*;


public class Starts
{
	public static void main(String[] args)
	{
		Account a1 = new Account(101, 1500);  //
		Account a2 = new Account(102, 1600);  //
		Account a3 = new Account(103, 1700);   //
		Account a4 = new Account(104, 1900);  // 
		Account a5 = new Account(105, 1800);  //
		Account a6 = new Account();
		
		Account accounts[] = new Account[]{a1, a2, a3, a4, a5};
		accounts[2] = null;
		for(int i= 0; i<accounts.length; i++)
		{
			if(accounts[i]!=null)
			{
				accounts[i].display();
			}
			else
			{
				System.out.println("No Account Available Here!");
			}
		}
		a2.deposit(500);		
		accounts[1].deposit(500);
		
		a1.transfer(a2 ,500);
		a1.display();
		a2.display();
		
		
		
	}
	static{
		System.out.println("hello world");
	}
}
