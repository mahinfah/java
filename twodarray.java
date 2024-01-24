import java.util.Scanner;

public class twodarray {
    
    public static void main (String args[]){
        System.out.println("Do you know the 2d array ? ");
        System.out.println("if u dont then it is here -");
         int [][] number = new int [2][2] ;
   
 Scanner sc = new Scanner(System.in);

         for (int i =0;i<2;i++){
            for (int j =0;j<2;j++){
           number[i][j]= sc.nextInt();
        }
    }


    for (int i =0;i<2;i++){
        for (int j =0;j<2;j++){
            System.out.print(number[i][j]);
        }
    }

}
}