package HomeWork2.HomeWork$WhileAndDoWhile;

import java.util.Scanner;

/**
 * Created by Dell on 08/03/2017.
 */
public class $4ReverseWhileLoopNumber {
    public static void main(String[] args) {
        int num=0;
        int number =0;
        System.out.println("\nEnter the number you want and press enter: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        while( num != 0 )
        {
            number = number * 10;
            number = number + num%10;
            num = num/10;
        }

        System.out.println("Reverse of input number is: "+number);
    }
}
