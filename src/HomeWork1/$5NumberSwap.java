package HomeWork1;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 26/02/2017.
 */
public class $5NumberSwap
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter number a : ");
        a=scanner.nextInt();
        System.out.println("Enter number b : ");
        b=scanner.nextInt();
        c=a;
        a=b;
        b=c;

        System.out.println("enter number a : \t" +a);
        System.out.println("enter number b : \t" +b);
    }
}
