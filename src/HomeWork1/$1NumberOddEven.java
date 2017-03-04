package HomeWork1;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 26/02/2017.
 */
public class $1NumberOddEven
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = scanner.nextInt();
        String a = num % 2 == 0 ? "Is Even" : "Odd";
        System.out.println(a);
    }

}
