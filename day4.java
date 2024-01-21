import java.util.Scanner;

public class loops{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
    
    System.out.println(n);
int sum = 1;
    for(int i = 1 ; i<= n ; i++){
    System.out.print(n);
        System.out.print("*");
        System.out.print(i);
        sum=n*i;
        System.out.print("=");
        System.out.println(sum);
        
    }
}
}
