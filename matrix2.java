import java.util.Scanner;

public class matrix2 {
    public static void main(String args[]){
System.out.println("hello");
Scanner sc = new Scanner(System.in);
int m = sc.nextInt();
int  n= sc.nextInt();
System.out.println(m);
System.out.println(n);

int A[][] = new int [m][n] ;

for (int i =0 ; i<m ;i++){

    for(int j = 0; j<n;j++){
System.out.println("Enter your this matrix ["+i+"] ["  +j+ "] =" );
A[i][j]=sc.nextInt();


    }
        
}
System.out.println( "HERE IS THE MATRIX :");
for (int i =0 ; i<m ;i++){

    for(int j = 0; j<n;j++){
//System.out.println( "HERE IS THE MATRIX :");
System.out.print(A[i][j] +" " );


    }

    System.out.println();
}}}