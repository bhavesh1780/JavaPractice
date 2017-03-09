package HomeWork2;

import java.util.Scanner;

/**
 * Created by Dell on 04/03/2017.
 */
public class $1RightAngleTriangle
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 1;
        System.out.println("Patten For Right Angle Triangle");

        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i ; j++)
            {
                System.out.print(x+" ");
                x++;
            }
            System.out.println(" ");
        }
    }
}
