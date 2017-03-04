package HomeWork1;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 01/03/2017.
 */
public class $19VowelOrConsonant
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInput any Alphabet : ");
        String word = scanner.next();
        char input = word.charAt(0);

        if (word.length() > 1)
        {
            System.out.println("Error it is a string or a Numbers");
        }

        if (input == 'a' | input =='A' | input =='e' | input =='E' | input =='i' | input == 'I' | input =='o' | input == 'O'
                | input =='u' | input == 'U')
        {
            System.out.print("\nInput Alphabet is Vowel");
        }
        else
        {
            System.out.println("\nEntered Alphabet is Consonant");
        }
    }
}
