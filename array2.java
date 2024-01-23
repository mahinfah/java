import java.util.Scanner;

public class array2 {
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);

int [] number = new int [5];

for(int i =0 ; i<5;i++){
    number[i]=sc.nextInt();


}


System.out.println("Herre is the array numbers you gave:");
for(int i = 0 ; i<5;i++){


    System.out.println(number[i]);
}

    }
    
}
