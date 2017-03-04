package HomeWork1;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 25/02/2017.
 */
public class $3MarkSheet
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Student Name \t \t \t \t : \t");
        String name = scanner.nextLine();
        System.out.print("Enter a Roll Number \t \t \t : \t");
        int rollNumber = scanner.nextInt();
        System.out.print("Enter the Marks of Computer \t : \t");
        int Subject1 = scanner.nextInt();
        if(Subject1 <0){System.out.println("Invalid Input Marks should not be negative");}
        System.out.print("Enter the Marks of Science \t \t : \t");
        int Subject2 = scanner.nextInt();
        if(Subject2 <0){System.out.println("Invalid Input Marks should not be negative");}
        System.out.print("Enter the Marks of Maths \t \t : \t");
        int Subject3 = scanner.nextInt();
        if(Subject3 <0){System.out.println("Invalid Input Marks should not be negative");}

        int total;
        float percentage;
        total = Subject1 + Subject2 + Subject3;
        percentage = total/3;

        System.out.print("\n Welcome to Marksheet");
        System.out.print("\n--------------------------------------------");
        System.out.print("\n Student Name \t  : \t " + name);
        System.out.print("\n Roll Number \t  : \t "  + rollNumber);
        System.out.print("\n--------------------------------------------");
        System.out.print("\n Subject \t\t Marks");
        System.out.print("\n--------------------------------------------");
        System.out.print("\n Computer \t \t " + Subject1);
        System.out.print("\n Science  \t \t " + Subject2);
        System.out.print("\n Maths    \t \t " + Subject3);
        System.out.print("\n--------------------------------------------");
        System.out.print("\n Total \t \t : " +total);

        if(percentage >=35)
        {
            System.out.print("\n Pass/Fail\t : Pass ");
        }else
            {
                System.out.print("\n Pass/Fail\t : Fail ");
            }
        if(percentage >=80)
        {
            System.out.println("\n Grade\t \t : \t A+" );
        }else if (percentage>=60)
        {
            System.out.println("\n Grade\t \t : \t A" );
        }else if (percentage>=50)
        {
            System.out.println("\n Grade\t \t : \t B" );
        }else if (percentage>=35)
        {
            System.out.println("\n Grade\t \t : \t c" );
        }
    }
}
