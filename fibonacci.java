import java.util.Scanner;

public class fibonacci
{
    public static void main(String args[])
    {
        int n,a=1,b=2,i,c=0;
        Scanner sr=new Scanner(System.in);
        System.out.println("enter n value:");
        n=sr.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(i=0;i<n-2;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }

}