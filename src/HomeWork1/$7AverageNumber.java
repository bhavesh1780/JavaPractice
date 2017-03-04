package HomeWork1;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 26/02/2017.
 */
public class $7AverageNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Five Numbers");

        float a=scanner.nextFloat();
        float b=scanner.nextFloat();
        float c=scanner.nextFloat();
        float d=scanner.nextFloat();
        float e=scanner.nextFloat();

       float f = (a+b+c+d+e)/5;

        System.out.println("Average of" +a+"  "+b+" "+c+" "+d+" "+e+"  = "+f);
    }
}
