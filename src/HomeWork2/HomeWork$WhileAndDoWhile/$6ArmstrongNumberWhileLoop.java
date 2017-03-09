package HomeWork2.HomeWork$WhileAndDoWhile;

import java.util.Scanner;

/**
 * Created by Dell on 08/03/2017.
 */
public class $6ArmstrongNumberWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter any number to check if it is armstrong or not:");
        int number = scanner.nextInt();
        int x,sum=0,temp = number;

        while(number>0)
        {
            x=number%10;
            number=number/10;
            sum=sum+(x*x*x);
        }
        if(sum==temp)
            System.out.print("Given number " + temp +" is Armstrong");
        else
            System.out.println("Given number " + temp +" is not Armstrong");
    }
}
