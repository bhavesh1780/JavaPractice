package HomeWork1;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 26/02/2017.
 */
public class $12UpperToLowerCase
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter any Character : ");
        String word = scanner.next();
        String word1 = word.toLowerCase();
        System.out.println(word1);
    }
}
