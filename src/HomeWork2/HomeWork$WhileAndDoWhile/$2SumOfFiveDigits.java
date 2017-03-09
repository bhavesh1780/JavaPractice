package HomeWork2.HomeWork$WhileAndDoWhile;

import java.util.Scanner;

/**
 * Created by Dell on 07/03/2017.
 */
public class $2SumOfFiveDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, Reminder, Sum = 0;
        System.out.println("\nEnter any Number: ");
        number = scanner.nextInt();

        while(number > 0) {
            Reminder = number % 10;
            Sum = Sum+ Reminder;
            number = number / 10;
        }
        System.out.format("Sum of the digits of Given Number = %d", Sum);
    }
}
