package HomeWork1;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 01/03/2017.
 */
public class $30TriangleNestedLoop
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Your Number for Left Angle Triangle Nested Loop to Display : ");
        int loop = scanner.nextInt();
        int i, j, k = 8;


        for (i = 0; i < 5; i++)
        {
            for (j = 0; j < k; j++)
            {
                System.out.print(" ");
            }
            k = k - 2;
            for (j = 0; j <= i; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
