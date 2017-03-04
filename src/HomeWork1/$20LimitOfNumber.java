package HomeWork1;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 01/03/2017.
 */
public class $20LimitOfNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInput a Number : ");
        int x = scanner.nextInt();

        int y,z,sum=0;
        System.out.println("The first n Natural Number is :");

        for (int i = 1; i <=x ; i++)
        {
            System.out.println(i);
            sum+=i;
        }
        System.out.println("Sum of Natural Number : "+sum);
    }
}
