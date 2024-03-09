import java.lang.*;
public class output1{
	
	
	public static int a = 5;
	private String msg;
	public output1(){
		a=a+5;
		System.out.println("programming is exciting!");
	}
	
	public output1(String msg){
		System.out.println("Understanding is the key");
	   this.msg=msg;
        a=10;
	}
	
	public void cut(int start, int end){
		
	System.out.println(msg.substring(start,end));
	this.a=7;
	
	}
	static {
		
		System.out.println("Greetings!");
	}
	public void findings(String s){
		System.out.println(s.indexOf('e'));
		System.out.println(s.charAt(5));
		a=a+15;
}

public static void main(String [] args){
	
	output1 person1=new output1("Learning is essential!");
	output1 person2=new output1();
	output1[] peopleArray= new output1[]{person1,person2};
	person1.cut(3,8) ;
	peopleArray[1].findings("Be honest!");
	System.out.println(person1.a);
	System.out.println(person2.a);
	System.out.println(peopleArray[0].msg);
	for(int i = 0 ; i<1;i++){
		peopleArray[0]=new output1();
	}
		



}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	