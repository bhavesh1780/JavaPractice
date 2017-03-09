package HomeWork2;

import java.util.Scanner;

/**
 * Created by Dell on 05/03/2017.
 */
public class $12RemoveArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, x, y = 1, z = 0;
        System.out.print("\nEnter elements you want in array:");
        number = scanner.nextInt();
        int a[] = new int[number];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < number; i++)
        {
            a[i] = scanner.nextInt();
        }
        System.out.print("Enter the element you want to delete:");
        x = scanner.nextInt();
        for (int i = 0; i < number; i++)
        {
            if(a[i] == x)
            {
                y =1;
                z = i;
                break;
            }
            else
            {
               y = 0;
            }
        }
        if(y == 1)
        {
            for(int i = z+1; i < number; i++)
            {
                a[i-1] = a[i];
            }
            System.out.print("These are the remaining elements after deleting :- ");
            for (int i = 0; i < number-2; i++)
            {
                System.out.print(a[i]+",");
            }
            System.out.print(a[number-2]);
        }
        else
        {
            System.out.println("Element not found");
        }
        }
    }
