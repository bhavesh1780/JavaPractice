package Practice;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 26/02/2017.
 */
public class Triangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Rows You Want In Your Pyramid?");
        int noOfRows = sc.nextInt();
        int rowCount = 1;
        System.out.println("Here Is Your Pyramid");


        for (int i = noOfRows; i > 0; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
            rowCount++;
        }
    }
}


