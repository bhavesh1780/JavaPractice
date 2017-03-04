package Practice;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 27/02/2017.
 */
public class Vowel {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter letter : ");
        String inString = new String("");
        inString = scanner.nextLine();

        if (inString.length() != 1)
        {
            System.out.println("Invalid entry.");
        } else if ((inString.compareTo("a") >= 0 && inString.compareTo("z") <= 0) ||
                (inString.compareTo("A") >= 0 && inString.compareTo("Z") <= 0))
        {
            if (inString.equals("a") || inString.equals("e") || inString.equals("i") || inString.equals("o") ||
                    inString.equals("u"))
            {
                System.out.println("Thank you for the vowel " + inString);
            } else if (inString.equals("A") || inString.equals("E") || inString.equals("I") || inString.equals("O") ||
                    inString.equals("U"))
            {
                System.out.println(inString + " is a vowel. ");
            } else
            {
                System.out.println(inString + " is a consonant. ");
            }
        } else
            {
            System.out.println("Not a letter.");
            }
    }

}
