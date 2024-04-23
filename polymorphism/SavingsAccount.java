import java.lang.*;

public class SavingsAccount extends Account
{
	private int tenureYear;
	
	public SavingsAccount()
	{
		
	}
	public SavingsAccount(int ano, double balance, int tenureYear)
	{
		super(ano, balance);
		this.tenureYear = tenureYear;
		System.out.println("Param SavingsAccount");
	}
	public void setTenureYear(int tenureYear)
	{
		this.tenureYear = tenureYear;
	}
	public int getTenureYear()
	{
		return tenureYear;
	}
	public void display()
	{
		super.display();
		System.out.println("Tenure Year: "+tenureYear);
	}
}