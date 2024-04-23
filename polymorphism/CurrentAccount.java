import java.lang.*;

public class CurrentAccount extends Account
{
	private int dailyNumTran;
	
	public CurrentAccount()
	{
		
	}
	public CurrentAccount(int ano, double balance, int dailyNumTran)
	{
		super(ano, balance);
		this.dailyNumTran = dailyNumTran;
		System.out.println("Param CurrentAccount");
	}
	public void setDailyNumTran(int dailyNumTran)
	{
		this.dailyNumTran = dailyNumTran;
	}
	public int getDailyNumTran()
	{
		return dailyNumTran;
	}
	public void display()
	{
		super.display();
		System.out.println("Tenure Year: "+dailyNumTran);
	}
}