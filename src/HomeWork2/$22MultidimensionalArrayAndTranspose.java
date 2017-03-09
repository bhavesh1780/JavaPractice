package HomeWork2;

import java.util.Scanner;

/**
 * Created by Dell on 07/03/2017.
 */
public class $22MultidimensionalArrayAndTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y,z[][]= new int[10][10];

        for(x=0;x < 3;x++)
        {
            for(y=0;y < 3;y++)
            {
                System.out.print("Enter your Number :");
                z[x][y] = scanner.nextInt();
            }
        }
        System.out.println("Multidimensional Array:-");
        for(x=0;x < 3;x++)
        {
            for(y=0;y < 3;y++)
                System.out.print(z[x][y]+" ");
            System.out.print("\n");
        }

        System.out.println("Transposed Array is :-");
        for(y=0;y < 3;y++)
        {
            for(x=0;x < 3;x++)
                System.out.print(z[x][y]+" ");
            System.out.print("\n");
        }
    }
}
