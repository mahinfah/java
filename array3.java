import java.util.Scanner;

public class array3 {
    public static void main(String args[]){

        int [] number = new int[5] ;           //*ehere using array we calculate the sum */
         Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<5 ; i++){
            number[i]=sc.nextInt();
        }
int sum = 0;
        for(int i = 0 ; i<5 ; i++){
           sum= sum+ number[i];
        }
        System.out.println("here is the sum :");
        System.out.println(sum);
    }
}
