import java.lang.*;

public class run{
	public static void main(String [] args){
		
		

System.out.println("testing");

Account s1= new Account("joy malik",500);


s1.display();
Account s2 = new Account();
s2.setname("kazi Fahad ");
s2.setamount(2000);


s2.deposit(4000);
// deposit must be more then 500 and the account should have max amount 10000
s2.withdraw(500);
// withdraw must be more than 1000 and minimum acocunt level 1000
s2.display();

s1.setamount(2000);
s2.transfer(s1,1000);
System.out.println("Your current money on Kazi Fahad :"+s2.getamount() );
System.out.println("Your current money on Joy Malik  :"+s1.getamount() );
	Account s3 = new Account();
	//transfer minimum 5000
	s3.setname("john snow");
	s3.setamount(6000);
	s3.transfer(s2,100000);
	System.out.println("Your current money on John snow:"+s3.getamount()) ;
	System.out.println("Your current money on Kazi Fahad :"+s2.getamount() );
	s3.display();
	}

}