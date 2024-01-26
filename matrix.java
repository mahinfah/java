import java.util.Scanner;

public class matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int  b = sc.nextInt();
       // System.out.println(a);
       // System.out.println(b);
 int [][]A = new int [a][b];
 for(int i =0 ; i<a;i++) {
    for (int j=0 ; j<b; j++){
      (A[i][j])= sc.nextInt();
    }
 }
System.out.println("Here is your matrix :");

 for(int i =0 ; i<a;i++) {
    for (int j =0 ; j<b; j++){
        System.out.print(" "+A[i][j]);

    }
    System.out.println();
 }
}
 }
