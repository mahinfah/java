import java.lang.*;
public class pin{
	public static void main (String[] args){
		
		Bkash s1= new Bkash();
		Bkash s2 = new Bkash();
		s1.setname("mahin");
		s1.setamount(10000);
		s2.setname("john");
		s2.setamount(3000);
		s1.display();
		s2.display();
		s1.transfer(s2,5000);
		System.out.println("that was the previous money-------------------");
	System.out.println("--------------------------------")	;
		System.out.println("After transfer:");

System.out.println("After giving money :"+s1.getamount() +"=  "+s1.getname());

System.out.println("After receiving money :"+s2.getamount()+"=  "+s2.getname());


                                              }


}                   