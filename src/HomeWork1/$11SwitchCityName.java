package HomeWork1;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 26/02/2017.
 */
public class $11SwitchCityName
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Alphabet");
        char alphabet = scanner.next().charAt(0);

        switch (alphabet)
        {
            case 'a' & 'A':
                System.out.println("Ahmedabad");
                break;
            case 'b':
                System.out.println("Baroda");
                break;
            case 'c':
                System.out.println("China");
                break;
            case 'd':
                System.out.println("Delhi");
                break;
            case 'e':
                System.out.println("Edinburgh");
                break;
            case 'f':
                System.out.println("France");
                break;
            default:
                System.out.println("Invalid Alphabet");
        }
    }
}
