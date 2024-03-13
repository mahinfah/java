import java.lang.*;
public class output2
{
    public int a;
    public static int b;
    public String arr[];
    public output2()
    {
        b=20;
        System.out.println("output2ing");
    }
    public output2(int a, int s)
    {
        this.a=a;
        b=b+10;
        arr=new String[s];
        System.out.println("Programming is fun");
    }
    static
    {
        System.out.println("If understands");
        b=30;
    }
    public void StringOP(String s1, String s2)
    {
        arr[0]=s1;
        arr[1]=s2;
        System.out.println(arr[0].length());
        System.out.println(arr.length);
        arr[2]=arr[0].concat(arr[1]);
        System.out.println(arr[2]);
    }
    public void arr2Demo()
    {
        int arr2d[][]=new int [][]{{10,13},{14,15}};
        for(int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
                if(arr2d[i][j]%2!=0)
                {
                    System.out.println(arr2d[i][j]);
                }
            }
        }
    }
	public static void main(String[] args) {
        output2 t1= new output2(2,3);
        output2 t2 =new output2();
        System.out.println(t1.a);
        System.out.println(t2.a);
        System.out.println(t1.b);
        System.out.println(t2.b);
        t1.StringOP("Hello","hi");
        t2.arr2Demo();
    }
}