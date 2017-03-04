package HomeWork1;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 26/02/2017.
 */
public class $6EmployeeSalary
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEmployee id \t : \t");
        int id = scanner.nextInt();
        System.out.print("Employee name \t : \t");
        String name = scanner.next();
        System.out.print("salary \t \t     : \t ");
        double salary = scanner.nextDouble();

        double hra = ((salary*10)/100);
        double da = ((salary*8)/100);
        double ta = ((salary*9)/100);
        double pf = ((salary*20)/100);
        double grossSalary = salary+hra+da+ta-pf;

        System.out.print("\n Salary Slip");
        System.out.print("\n------------------------------------------------");
        System.out.print("\n Employee Name \t     : " + name);
        System.out.print("\n Employee Number \t :"  + id);
        System.out.print("\n------------------------------------------------");
        System.out.print("\n Basic Salary \t\t :" +salary);
        System.out.print("\n HRA 10% \t \t     :" +hra);
        System.out.print("\n DA 8%  \t \t     :" +da);
        System.out.print("\n TA 9%    \t \t     :" +ta);
        System.out.println("\n PF 20% \t \t     :" +pf);
        System.out.print("\n------------------------------------------------");
        System.out.print("\n GrossSalary \t     : " +grossSalary);

    }
}
