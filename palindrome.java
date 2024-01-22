import java.util.Scanner;

public class palindrome {

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        // System.out.print(a);
int sum = 0;
int r;

        while(a!=0){
            r = a%10;
            sum = sum*10+ r;
             a=a/10;
           }
    System.out.println(sum);
}
}