import java.lang.*;
public class variable{
	
	//public variable(){
		
	//}
	
	private int name;
	public static int merekomaro;
	
	public void setname(int a){
	this.name =a;
	
	
	}
	
	public void getstatic(int a){
		this.merekomaro=a;
	}
	public int getname(){
	return name ;}
	public void show(){
	
		System.out.println("here is :  "+name);
			System.out.println("here is another :"+merekomaro);
	}
	public static void main(String [] args){
		
		System.out.println("hello world");
		
		variable s1=new variable();
		s1.getstatic(800);
		s1.setname(456);
		s1.show();
  /// System.out.println("dss"+getname());		
		

}


}
	
	
	
	
