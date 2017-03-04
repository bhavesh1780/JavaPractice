package HomeWork1;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 26/02/2017.
 */
public class $21TriangleNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNumber of Rows You Want : ");
        int noOfRow = scanner.nextInt();
        int rowCount = 1;
        System.out.println("Your Triangle with Number");

        for (int i = noOfRow; i > 0; i--)
        {
            for (int j = 1; j <= i ; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= rowCount ; k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
            rowCount++;
        }
    }
}
