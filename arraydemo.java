import java.lang.*;
import java.util.*;

public class arraydemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//1st approach
		int arr1[] = new int[3];
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		//arr1[3] = 40;//error
		/*for(int i=0; i<arr1.length; i++)
		{
			arr1[i] = sc.nextInt();
		}*/
		System.out.println("using for loop");
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println("arr1["+i+"]: "+arr1[i]);
		}
		System.out.println("using while loop");
		int j = 0;
		while(j<arr1.length)
		{
			System.out.println(arr1[j]);
			j++;
		}
		System.out.println("using do while loop");
		int k = 0;
		do
		{
			System.out.println(arr1[k]);
			k++;
		}while(k>arr1.length);
		System.out.println("---------------");
		
		//2nd approach
		int arr2[];
		int size = arr1[2]/arr1[0];
		arr2 = new int[size];
		arr2[0] = 40;
		arr2[1] = 50;
		arr2[2] = 60;
		//using for loop
		for(int i=0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		//3rd approach
		int sum = 0;
		int arr3[] = new int[] {100, 200, 300};
		for(int i=0; i<arr3.length; i++)
		{
			System.out.println(arr3[i]);
			sum = sum + arr3[i];
		}
		System.out.println("Sum of array elements: "+sum);
		int arr4[] = {150, 250, 350};
		for(int i=0; i<arr4.length; i++)
		{
			System.out.println(arr4[i]);
			sum = sum + arr4[i];
		}
		//2d array
		int arr5[][] = new int[][] { {10, 20, 50}, {30, 40, 60} };
		for(int m = 0; m<2; m++)
		{
			for(int n = 0; n<3; n++)
			{
				System.out.println("arr5["+m+"]["+n+"]: "+arr5[m][n]);
			}
		}
		
		
		for(int i = 0 ; i<2;i++){
			for(int y = 0 ; y<3;y++){
				
				System.out.print(arr5[i][y]+" ");
			}
			System.out.println();
			
			
		}
	}
}