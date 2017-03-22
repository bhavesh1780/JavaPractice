package HomeWork2.Programe$Arrays;

import java.util.Scanner;

/**
 * . Write a Java program to insert an element (specific position) into an array.
 */
public class $8InsertElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Number of Element you Want : ");
        int number, pos, x;
        number = scanner.nextInt();
        int a[] = new int[number + 1];
        System.out.println("\nEnter the Elements : ");

        for (int i = 0; i < number ; i++)
        {
        a[i]=scanner.nextInt();
        }
        System.out.print("Enter the Posiotion Where you want to Insert Element :");
        pos = scanner.nextInt();
        System.out.print("Enetr the Element you Want to Insert");
        x = scanner.nextInt();

        for (int i = (number-1); i < (pos-1); i--)
        {
        a[i+1] = a[i];
        }
        a[pos-1] = x;
        System.out.print("After inserting : ");
        for (int i = 0; i < number; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[number]);
    }
}
