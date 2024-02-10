public class Start{

public static void main(String[] args)
{
	   Teacher s1  = new Teacher();
		s1.setname("kazi Fahad Mahin");
      
	  // trying a invalid salary 		

		s1.setsalary(0);
		s1.setsalary(660000);
		System.out.println("Name    :"+s1.getname());
		System.out.println("Salary    :"+s1.getsalary());
		
		Teacher s2 = new Teacher("james bond",880000);
		s2.showdetails();
	}
}