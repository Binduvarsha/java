import java.util.Scanner;

public class RightInvertTriangle {
    public static void main(String args[]) {
        int i, j, n;
        Scanner sr = new Scanner(System.in);
        System.out.println("enter n value:");
        n = sr.nextInt();
        for (i = n; i >= 1; i--)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}
