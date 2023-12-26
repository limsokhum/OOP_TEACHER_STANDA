//package demo;
import java.util.Scanner;
public class TriangleFrame
{
    public static void main(String[] args)
    {
        int num, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        num = sc.nextInt();
        System.out.println();
        n = num;
        for (int r = 1; r <= num; r++)
        {
            for (int sp = 1; sp <= r; sp++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= n; c++) {
                System.out.print("*");
            }
            for (int c = num - r; c >= 1; c--) {
                System.out.print("*");
            }
            n--;
            System.out.println();
        }
        for (int r = 2; r <= num; r++) {
            for (int sp = num - r + 1; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int c = 1; c <= r; c++) {
                System.out.print("*");
            }
            for (int c = r - 1; c >= 1; c--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}