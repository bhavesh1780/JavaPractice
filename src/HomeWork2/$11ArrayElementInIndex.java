package HomeWork2;

import java.util.Scanner;

/**
 * Created by Dell on 05/03/2017.
 */
public class $11ArrayElementInIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter any Number : ");
        int a = scanner.nextInt();

        int[] x = {10, 30, 40, 60};
        if (x[0] == a || x[1] == a || x[2] == a || x[3] == a)
        {
            System.out.println("Entered Value is in Array ");

            for (int i = 0; i < x.length; i++) {
                if (x[i] == a) {
                    System.out.println(x[i] + " is on Array Index Number " + i);
                    break;
                }
            }
        } else {
            System.out.println("Entered Value is Not in Array");

        }
    }
}
