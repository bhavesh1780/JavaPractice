package HomeWork1;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 27/02/2017.
 */
public class $16NumberAlphabetOrSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter your value :-");
        String word = scanner.next();
        char ch = word.charAt(0);

        if(word.length() >1)
        {
            System.out.println("Error Input Value is String");
        }

        if (ch >= 'A' && ch <= 'Z'){
            System.out.println("Entered vakue is Uppercase alphabet");
        }else if (ch >= 'a' && ch <='z'){
            System.out.println("Entered value is Lowercase alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Entered value is Digit");
        } else
        {
            System.out.println("Entered value is symbol");
        }
    }
}
