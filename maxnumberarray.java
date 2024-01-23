import java.util.Scanner;

public class array3 {
    public static void main(String args[]){

        int [] number = new int[5] ;           //*ehere using array we calculate the maximum number */
         Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<5 ; i++){
            number[i]=sc.nextInt();
        }
int sum = number[1];
        for(int i = 0 ; i<5 ; i++){
           if( number[i]>=sum){
            sum = number[i];
           }
        }
        System.out.println("here is the maximum number:");
        System.out.println(sum);
    }
}
