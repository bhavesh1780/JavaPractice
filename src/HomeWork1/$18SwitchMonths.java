package HomeWork1;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 26/02/2017.
 */
public class $18SwitchMonths
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Month");
        String months = scanner.nextLine();

        switch (months)
        {
            case "January":
                System.out.println("January has 31 days in a month : ");
                break;
            case "February":
                System.out.println("February has 28 days in a month or has 29 days");
                break;
            case "March":
                System.out.println("March has 31 days in a month");
                break;
            case "April":
                System.out.println("April has 30 days in a month");
                break;
            case "May":
                System.out.println("May has 31 days in a month");
                break;
            case "June":
                System.out.println("June has 30 days in a month");
                break;
            case "July":
                System.out.println("July has 31 days in a month");
                break;
            case "August":
                System.out.println("August has 31 days in a month");
                break;
            case "September":
                System.out.println("September has 30 days in a month");
                break;
            case "October":
                System.out.println("October has 31 days in a month");
                break;
            case "November":
                System.out.println("November has 30 days in a month");
                break;
            case "December":
                System.out.println("December has 31 days in a month");
                break;
            default:
                System.out.println("Enter Month days is Invalid");
                break;
        }
    }
}
