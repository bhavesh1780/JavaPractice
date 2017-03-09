package HomeWork2;

import java.util.Scanner;

/**
 * Created by Dell on 04/03/2017.
 */
public class $3PascalTriangle
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Number of Rows : ");
        int x,y,z,number=1,j;
        x=scanner.nextInt();

        for (y = 0; y < x ;y++)
        {
            for (z = x; z >y ; z--)
            {
                System.out.print(" ");
            }
            number=1;
            for (j = 0; j <=y ; j++)
            {
                System.out.print(number+ " ");
                number = number * (y-j)/(j+1);
            }
            System.out.println();
        }
    }
}
