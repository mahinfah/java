import java.lang.*;
public class output{   // main function test.java
	
	
	public int a;
	public static int  b;
	public String arr[];
	
	public output(){
      b = 20;
	 System.out.println("testing");
	 
	 }
		 public output(int a ,int s){
this.a = a;
			 
	b=b+10;
arr = new String[s];
	System.out.println("cp  is   fun");
		 }
		  
		  static {
			  System.out.println("if understand!");
           b =30;			  
		  }
		  
		  public void StringOP(String s1,String s2)
		  {arr[0]=s1;
		  arr[1]=s2;
		  System.out.println(arr[0].length());
		  System.out.println(arr.length);
		  arr[2]=arr[0].concat(arr[1]);
		  System.out.println(arr[2]);
		  
		  }
		  public void arr2demo(){
			  int arr2d[][]=new int[][]{{20,23},{14,15}};
			for(int i = 0 ; i <2 ;i++){
				for(int j = 0 ; j<2;j++)
				
				{
				if(arr2d[i][j]%2!=0){
					System.out.println(arr2d[i][j]);
				                }

			}				
	
	                            	  }



/* main function from test.java


import java.lang.*;
public class test{
public static void main(String[] args){
	output t1 = new output(2,3);
	output t2= new output();
	System.out.println(t1.a);
	System.out.println(t2.a);
	System.out.println(t1.b);
	System.out.println(t2.b);
	t1.StringOP("Hello","Hi");
t2.arr2demo();}
	*/








			  
		  
}
}
