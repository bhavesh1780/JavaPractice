package HomeWork1;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 25/02/2017.
 */
public class $13SymbolIfElse
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int x = scanner.nextInt();
        System.out.println("Enter Second Number");
        int y = scanner.nextInt();
        System.out.println("Enter a Symbol");
        char z = scanner.next().charAt(0);
      //  int ans;

        if (z == '+') {
//            ans = x + y;
            System.out.println("Addition of " + x + " and " + y + " = " + (x+y));
        }
        else if (z == '-')
        {
//            ans = x - y;
            System.out.println("Substraction of " + x + " and " + y + " = " + (x-y));
        }
        else if (z == '/')
        {
//            ans = x / y;
            System.out.println("Dividion of " + x + " and " + y + " = " + (x/y));
        }
        else if(z == '*')
        {
//            ans = x * y;
            System.out.println("Multiplication of " + x + " and " + y + " = " + (x*y));
        }
        else
            System.out.println("Invalid Number");
}
}
