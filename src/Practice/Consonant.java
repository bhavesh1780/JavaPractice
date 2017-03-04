package Practice;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 28/02/2017.
 */
public class Consonant
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInput any Alphabet : ");
        char input = scanner.next().charAt(0);

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
