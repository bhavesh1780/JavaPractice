package Practice;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 01/03/2017.
 */
public class NameAlphabetCount
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Name : ");
        String name = scanner.nextLine();
        int total = 0;
        char ch;
        System.out.print("\nNumber of character in a name is :" +name.length());
        System.out.println("\nLetter  :" + " Position in ABCD");

        for (int i = 0; i < name.length() ; i++)
        {
        char letter = name.charAt(i);
            int a = 1;
            for (ch = 'a'; ch <= 'z' ; ch++)
            {
            if (String.valueOf(ch).equalsIgnoreCase(String.valueOf(letter)))
            {
                System.out.println(letter + " is at : " + a);
                total = total + a;
            }
                a++;
            }
        }
        System.out.println("Total of Character Position in ABCD for Name is : " +total);
    }

}
