import java.lang.*;

public class Teacher{
	 
	 private String name ;
	 private double salary;
	 
	 public Teacher ( String name , double salary){
		 
		 System.out.println("Parameterized Constructor");
		 
		 
	 setname(name);
	 setsalary(salary);
	                              }
	 
	 
	 public Teacher(){
	 System.out.println("empty-constructor");
	 }
	 
	 public void setname(String name)
	 {
	     this.name=	 name;
	                }
	 public void setsalary(double salary)
	 {
		 if(salary<=0){
		
			 System.out.println("Your salary digits are invalid ");
	                    }
						else 
							this.salary=salary;
}
	public String getname(){
		return name;
			}
			
			
	 public double getsalary(){
	 return salary;
	                    }
			public void showdetails(){
				
					System.out.println("----------------------------------------");
					System.out.println("Name          :"+name);	
				 
					System.out.println("Salary amount :"+salary);
					System.out.println("-----------------------------------------");	
			}
}