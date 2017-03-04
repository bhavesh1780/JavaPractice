package Practice;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 26/02/2017.
 */
public class DaysInMonths
{
    public static void main(String[] args)
    {
    int month, days=31;
    Scanner input = new Scanner(System.in);

    System.out.print("Type the month number [1-12]: ");
    month = input.nextInt();

    if(month>12 || month<1)
    {
    System.out.println("Invalid month");
    return;
    }

    switch( month )
    {
        case 2:
            days -=2;

        case 4: case 6: case 9: case 11:
        days--;
    }
    System.out.printf("The month %d has %d days", month, days);
    }
}
