import java.util.Scanner;

public class Triangle {
    public static void main(String args[]) {
        int r,c,s;
        int n;
        Scanner sr = new Scanner(System.in);
        System.out.println("enter n value:");
        n = sr.nextInt();
        for(r=1;r<=n;r++)
        {
            for(s=n;s>=r;s--)
                System.out.print(" ");
            for(c=1;c<=r;c++)
            {
                if(c==1||c==r||r==n)
                    System.out.print("* ");
                else
                    System.out.print("* ");

            }
            System.out.print("\n");
        }
    }
}
