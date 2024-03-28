import java.lang.*;
public class human
{
	private int id;
	private facebook fab;
	
	public human()
	{
		System.out.println("Empty human");
	}
	public human(int id, facebook fab)
	{
		System.out.println("para Human");
		this.id = id;
		this.fab=fab;
	}
	
	
	public void display()
	{
		System.out.println("ID: "+id);
		//System.out.println("Calc: "+calc);
		//calc.display();
		//c1.display();
		//c2.display();
	}
	public void dailyhour(int n )
	{   
		
		fab.dailyhour(n);
	}
	
		

}