package HomeWork1;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 27/02/2017.
 */
public class $28FloydsTriangle
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the Number : ");
        int number = scanner.nextInt();
        int rowCount = 1;
        System.out.println("Floyd's triangle");
        System.out.print("****************");

        for (int i = 0; i <= number; i++)
        {
            for (int j = 1; j <= i ; j++)
            {
                System.out.print(rowCount+" ");
                rowCount++;
            }
            {
                System.out.println(" ");
            }

        }
    }
}
