package HomeWork1;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 28/02/2017.
 */
public class $29MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter any Number : ");
        int x = scanner.nextInt();

        for (int i = 1; i <= 10 ; i++)
        {
            System.out.println(x + " * " + i +" = " + x * i );
        }
    }
}
