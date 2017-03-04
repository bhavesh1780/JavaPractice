package HomeWork1;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 25/02/2017.
 */
public class $23FibonacciSereies {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the limit for the loop:-");
        int count = scanner.nextInt();

        int x1 = 0, x2 = 1, x3;

        System.out.print(x1 + " " + x2);

        for (int i = 2; i < count ; i++)
        {
        x3 = x1 + x2;
            System.out.print(" " +x3);
            x1 = x2;
            x2 = x3;
        }
    }

}