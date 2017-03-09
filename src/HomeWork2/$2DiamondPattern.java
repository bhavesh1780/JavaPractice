package HomeWork2;

import java.util.Scanner;

/**
 * Created by Dell on 04/03/2017.
 */
public class $2DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNumber of Rows in Diamond : ");
        int noOfRow = scanner.nextInt();
        int mRow = noOfRow/2;
        int row = 1;
        System.out.println("Below is you Diamond Pattern");

        for (int i = mRow; i > 0; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            row++;
        }
        for (int i = 0; i <= mRow; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int j = row; j > 0; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
            row--;
        }
    }

}
