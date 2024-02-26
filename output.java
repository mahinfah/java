import java.lang.*;
public class output{
	
	
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
		  
}}