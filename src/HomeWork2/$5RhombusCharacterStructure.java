 package HomeWork2;

import java.util.Scanner;

/**
 * Created by Dell on 08/03/2017.
 */
public class $5RhombusCharacterStructure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInput the number:  ");
        int number = scanner.nextInt();
        int count = 1;
        int spaces = 1;
        char alphabets  = 'A';

        for (int i = 1; i < (number * 2); i++)
        {
            for (int spc = number - spaces; spc > 0; spc--)
            {
                System.out.print(" ");
            }
            if (i < number)
            {
                spaces++;
            } else
            {
                spaces--;
            }
            for (int j = 0; j < count; j++)
            {
                System.out.print(alphabets);
                if (j < count / 2)
                {
                    alphabets++;
                } else
                {
                    alphabets--;
                }
            }
            if (i < number)
            {
                count = count + 2;
            } else {
                count = count - 2;
            }
            alphabets = 'A';
            System.out.println();
        }
    }
}
