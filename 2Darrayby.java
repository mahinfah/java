import java.lang.*;
import java.util.Scanner; // for userinput purpose
 public class array{
	 
	 public static void main(String[] args){
	 
	   int e[][] = new int[2][2];
	 Scanner sc = new Scanner(System.in);
	 for(int i = 0 ; i<2 ;i++){
		 for(int j = 0 ;j<2;j++){
		 System.out.print("row num["+i+"]col num["+j+"]  :");
			 e[i][j]=sc.nextInt();
			 
		 }
	 
        
       
	 }for(int i = 0 ;i<2;i++){
	 for(int j = 0 ; j<2 ;j++){
		 
	//int arr[i]=sc.nextInt();
	 System.out.print(e[i][j]);
	 }
	 System.out.println();
	 
 }
 }
 }
 
