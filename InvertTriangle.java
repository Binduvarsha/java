import java.util.Scanner;

public class InvertTriangle {
    public static void main(String args[]) {
        int r,c,s;
        int n;
        Scanner sr = new Scanner(System.in);
        System.out.println("enter n value:");
        n = sr.nextInt();
        for(r=n;r>=1;r--)
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
