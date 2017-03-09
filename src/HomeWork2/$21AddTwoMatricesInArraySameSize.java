package HomeWork2;

import java.util.Scanner;

/**
 * Created by Dell on 06/03/2017.
 */
public class $21AddTwoMatricesInArraySameSize {
    public static void main(String args[])
    {
        int x, y, z, d;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInput number of rows : ");
        x = scanner.nextInt();
        System.out.println("Input number of columns : ");
        y  = scanner.nextInt();

        int number[][] = new int[x][y];
        int number1[][] = new int[x][y];
        int sum[][] = new int[x][y];

        System.out.println("Input first element : ");

        for (  z = 0 ; z < x ; z++ )
            for ( d = 0 ; d < y ; d++ )
                number[z][d] = scanner.nextInt();

        System.out.println("Input second element : ");

        for ( z = 0 ; z < x ; z++ )
            for ( d = 0 ; d < y ; d++ )
                number1[z][d] = scanner.nextInt();

        for ( z = 0 ; z < x ; z++ )
            for ( d = 0 ; d < y ; d++ )
                sum[z][d] = number[z][d] + number1[z][d];

        System.out.println("Sum of the matrices:-");

        for ( z = 0 ; z < x ; z++ )
        {
            for ( d = 0 ; d < y ; d++ )
                System.out.print(sum[z][d]+"\t");

            System.out.println();
        }
    }
}
