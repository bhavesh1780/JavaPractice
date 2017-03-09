package HomeWork2;

import java.util.Scanner;

/**
 * Created by Dell on 04/03/2017.
 */
public class $4RhombusNumberStructure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInput the number:  ");
        int number = scanner.nextInt();
        int count = 1;
        int spaces = 1;
        int start = 0;

        for (int i = 1; i < (number * 2); i++)
        {
            for (int spc = number - spaces; spc > 0; spc--)
            {
                System.out.print(" ");
            }
            if (i < number)
            {
                start = i;
                spaces++;
            } else
            {
                start = number * 2 - i;
                spaces--;
            }
            for (int j = 0; j < count; j++)
            {
                System.out.print(start);
                if (j < count / 2)
                {
                    start--;
                } else
                {
                    start++;
                }
            }
            if (i < number)
            {
                count = count + 2;
            } else {
                count = count - 2;
            }

            System.out.println();
        }
    }
}
