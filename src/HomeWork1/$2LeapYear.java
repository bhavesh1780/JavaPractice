package HomeWork1;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 26/02/2017.
 */
public class $2LeapYear
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCheck if it is a Leap Year or Not");
        int num = scanner.nextInt();

        if (num % 4 == 0)
        {
            System.out.println(num + " Is a Leap Year ");
        }
        else
        {
            System.out.println(num + " Is Not a Leap Year ");
        }
    }
}
