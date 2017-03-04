package Practice;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 27/02/2017.
 */
public class NumberAlphabetOrSymbol1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter any value :-");
        String value = scanner.nextLine();

        if (Character.isLetter(value.charAt(0))){
            System.out.println("Entered value is an Alphabet");
            if (Character.isUpperCase(value.charAt(0))){
                System.out.println("Entered value is Upper case alphabet");
            }
            else {
                System.out.println("Entered value is Lower case alphabet");
            }
        }
        else if (Character.isDigit(value.charAt(0))) {
            System.out.println("Entered value is Digit");
        }
        else {
            System.out.println("Entered value is Symbol");
        }

    }
}

