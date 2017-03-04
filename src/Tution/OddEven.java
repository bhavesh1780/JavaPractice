package Tution;

import java.util.Scanner;

/**
 * Created by Dell on 25/02/2017.
 */
public class OddEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Number");
        int num = input.nextInt();

        if (num <0){
            System.out.println("Entered number is invalid");
        }
        else {

            if (num % 2 == 0) {
                System.out.println(num + " is  Even number");
            } else {
                System.out.println(num + " is Odd number");
            }
        }
}
}
