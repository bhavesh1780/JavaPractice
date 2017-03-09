package HomeWork2.HomeWork$WhileAndDoWhile;

import java.util.Scanner;

/**
 * Created by Dell on 07/03/2017.
 */
public class $8PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter any Number : ");
        int number = scanner.nextInt();
        int x = 2, f = 0;

        do
        {
        if(number != 2 && number%x==0)
        {
        f = 1;
        break;
        }
        x++;
        }while (x <= Math.sqrt(number));

        if (f == 0)
        {
            System.out.println("Enter Number is Prime");
        }else
        {
            System.out.println("Enter Number is Not Prime");
        }


    }
}
