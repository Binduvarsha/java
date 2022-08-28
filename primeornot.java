import java.util.Scanner;
public class primeornot
{
    public static void main(String args[])
    {
        Scanner sr = new Scanner(System.in);
        int n,c=0;
        System.out.println("enter n value:");
        n = sr.nextInt();
        if (n<=1)
        {
            System.out.println("enter +ve only");
        }
        for(int i=1;i<=n;i++)
        {
            if ((n % i) == 0)
            {
                c=c+1;

            }
        }

        if (c==2)
        {
            System.out.println("is prime");
        }
        else
        {
            System.out.println(" not prime");
        }
    }


}


