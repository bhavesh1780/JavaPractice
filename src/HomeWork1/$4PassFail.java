package HomeWork1;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 26/02/2017.
 */
public class $4PassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Student Name \t \t \t \t : \t");
        String name = scanner.nextLine();
        System.out.print("Enter a Roll Number \t \t \t : \t");
        int rollNumber = scanner.nextInt();
        System.out.print("Enter the Marks of Computer \t : \t");
        int subject1 = scanner.nextInt();
        if (subject1 < 0 && subject1 >100) {
            System.out.println("Invalid Input Marks should not be negative");
        }
        System.out.print("Enter the Marks of Science \t \t : \t");
        int subject2 = scanner.nextInt();
        if (subject2 < 0) {
            System.out.println("Invalid Input Marks should not be negative");
        }
        System.out.print("Enter the Marks of Maths \t \t : \t");
        int subject3 = scanner.nextInt();
        if (subject3 < 0) {
            System.out.println("Invalid Input Marks should not be negative");
        }

        int total;
        float percentage;
        total = subject1 + subject2 + subject3;
        percentage = total / 3;
        String result=null ;
        if (subject1 >=35 && subject2 >=35 && subject3>=35){
            result = "Pass";
        }else
        {
            result = "Fail";
        }

        System.out.print("\n Welcome to Marksheet");
        System.out.print("\n-------------------------------------------------------------------");
        System.out.print("\n Student Name \t  : \t " + name);
        System.out.print("\n Roll Number \t  : \t " + rollNumber);
        System.out.print("\n-------------------------------------------------------------------");
        System.out.print("\n Subject \t\t Marks");
        System.out.print("\n-------------------------------------------------------------------");
        System.out.print("\n Computer \t \t " + subject1);
        System.out.print("\n Science  \t \t " + subject2);
        System.out.print("\n Maths    \t \t " + subject3);
        System.out.print("\n-------------------------------------------------------------------");
        System.out.print("\n Total \t \t : " + total);
        System.out.print("\n Pass/Fail\t : " +result);
            if (percentage >= 80) {
                System.out.println("\n Grade\t \t : \t A+");
            } else if (percentage >= 60) {
                System.out.println("\n Grade\t \t : \t A");
            } else if (percentage >= 50) {
                System.out.println("\n Grade\t \t : \t B");
            } else if (percentage >= 35) {
                System.out.println("\n Grade\t \t : \t c");
            }
        }
    }






































































































































































