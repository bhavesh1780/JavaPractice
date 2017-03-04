package HomeWork1;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 25/02/2017.
 */
public class $14SwitchSymbol
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Choice of Symbol");
        char z = scanner.next().charAt(0);
        int x = 20;
        int y = 10;

        switch (z)
        {
            case '+':
                System.out.println("Addition of " + x + " and " + y + " = "+(x+y));
                break;
            case '-':
                System.out.println("Substraction of " + x + " and " + y + " = "+(x-y));
                break;
            case '/':
                System.out.println("Division of " + x + " and " + y + " = "+(x/y));
                break;
            case '*':
                System.out.println("Multiplication of " + x + " and " + y + " = "+(x*y));
                break;
            default:
                System.out.println("Enter Symbol is Invalid");
                break;
        }

    }
}