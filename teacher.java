public class teacher{

    private String name ;
    private double salary ;
   
    
    public teacher ()
    {
        System.out.println("empty constructor");
    }
    
    public teacher (String name , double salary){
        
        System.out.println("p constructor");
        setName (name);
        setsalary (salary);
    }
    
    public void setName (String name){
        this.name=name;
    }
   
    
   public void setsalary (double salary){
   
   this.salary=salary;
   }
   
   public String getName(){
   return name  ;
   }	
        
        public double getsalary(){
            return salary;
   
        }
        public void display(){
            
            System.out.println("_------------------------------------_");
            System.out.println("Name :"+name);
        System.out.println("salary  :"+salary);
        }
        
        
             
        
	 public  class start{
        public static void main ( String []args){
            
   teacher s1 =new teacher("kazi fahad mahin",346364);	
       s1.display();	 }
        }
    }