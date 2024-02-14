import java.lang.*;
public class Salary{
public double id;
public double salary;
	
public Salary(double id , double salary){
this.id= id;
this.salary = salary ;
}	
	
public double yearlysalary()
{
	double yearlysalary = 12*salary;
	System.out.println("your salary is in a year  :"+ yearlysalary);
return yearlysalary;
}
public void show()
{
	System.out.println("your id is :"+id);
	
	//System.out.println("your salary is in a year  :"+ salary);
}
}
	