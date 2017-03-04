package HomeWork1;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 26/02/2017.
 */
public class $10CityNameIfElse
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cityName = scanner.nextLine();

        if (cityName.equalsIgnoreCase("a"))
        {
            System.out.println("Ahmedabad");

        }else if (cityName.equalsIgnoreCase("b"))
        {
            System.out.println("Bombay");
        }else if (cityName.equalsIgnoreCase("c"))
        {
            System.out.println("China");
        }else if (cityName.equalsIgnoreCase("d"))
        {
            System.out.println("Delhi");
        }else if (cityName.equalsIgnoreCase("e"))
        {
            System.out.println("Edinburgh");
        }else
            System.out.println("Invalid City Alhhabet Entered");

    }
}
