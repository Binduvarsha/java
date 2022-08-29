
import java.util.Scanner;

public class NthFibonacci
{
    public static void main(String args[])
    {
        int n,a=1,b=2,i,c=0;
        Scanner sr=new Scanner(System.in);
        System.out.println("enter n value:");
        n=sr.nextInt();
        for(i=0;i<n-2;i++)
        {
            c=a+b;
            if (i==n-3)
                System.out.print(c+"\n");

            a=b;
            b=c;
            c=a+b;
        }
    }

}

