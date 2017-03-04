package HomeWork1;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 26/02/2017.
 */
public class $15DivisionBy3And5
{
    public static void main(String[] args)
    {
        //Scanner scanner =new Scanner(System.in);

        System.out.println("\nNumber are Divided by 3 : ");
        for (int i = 1; i <=100 ; i++)
        {
            if (i % 3 == 0)
            {
                System.out.print(i + ",");
            }

        }

            System.out.println();
            System.out.println("\nNumber are Divided by 5 : ");
            for (int j = 1; j <= 100 ; j++)
            {
                if(j%5 ==0)
                {
                    System.out.print(j+",");
                }
            }

    }
}
