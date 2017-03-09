package HomeWork2;

import java.util.Scanner;

/**
 * Created by Dell on 05/03/2017.
 */
public class $10SpecificValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEntered Any Value : ");

        int b = scanner.nextInt();
        int a[] = {10, 45, 50, 60, 48};

            if (a[0]==b || a[1]==b || a[2]==b || a[3]==b || a[4]==b )
            {
                System.out.println("Entered Value is in Array ");
            }else{
                System.out.println("Entered Value is Not in Array");
            }

    }
}
