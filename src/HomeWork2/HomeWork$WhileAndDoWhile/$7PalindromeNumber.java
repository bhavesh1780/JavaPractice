package HomeWork2.HomeWork$WhileAndDoWhile;

import java.util.Scanner;

/**
 * Created by Dell on 07/03/2017.
 */
public class $7PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Number :- ");
        int number = scanner.nextInt();
        int x = number;
        int reverse=0,reminder;

        while (number > 0)
        {
        reminder= number % 10;
        reverse = reverse * 10 + reminder;
        number = number / 10;
        }
        if (reverse == x)
            System.out.println(x+ "  is Palindrome Number");
        else
            System.out.println(x+ " is not Palindrome Number");
    }
}
