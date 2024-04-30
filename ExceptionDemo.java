import java.lang.*;
import java.util.*;

public class ExceptionDemo
{
	private int x, y;
	private String s;
	
	public static void main(String[] args)
	{
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		ExceptionDemo ed = new ExceptionDemo();
		
		
		
		try
		{
			System.out.println("Enter a string: ");
			ed.s = sc.nextLine();//numerical string "10"
			ed.x = Integer.parseInt(ed.s);
			System.out.println("Enter another integer: ");
			ed.y = sc.nextInt();
			System.out.println(ed.x/ed.y);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Cannot divide by zero, try with other values!");
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Try with int values!");
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Try with numerical string values!");
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong!");
		}
		
		int arr[] = new int[]{10, 20, 30};
		try
		{
			for(int i = 0; i<4; i++)
			{
				System.out.println(arr[i]);
			}
		}
		/*catch(ArrayIndexOutOfBoundsException  aiobe)
		{
			System.out.println("Check your index!");
		}*/
		
		finally
		{
			System.out.println("Always executes!");
		}
		
	
		
		System.out.println("End");
		
	}
}