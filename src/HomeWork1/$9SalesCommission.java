package HomeWork1;

import java.util.Scanner;

/**
 * Created by Gamitapatel on 26/02/2017.
 */
public class $9SalesCommission
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Sales ID       : ");
        String salesID = scanner.next();
        System.out.print("Enter Sellers Name   : ");
        String name = scanner.next();
        System.out.print("Enter Sales Amount   : ");
        double salesAmount = scanner.nextDouble();
        System.out.print("Enter Basic Salary   : ");
        double salary = scanner.nextDouble();

        double commission;

        if (salesAmount >= 50000)
        {
            commission = (salesAmount*35)/100;
        }else if(salesAmount >= 30000)
        {
        commission = (salesAmount*20)/100;
        }else if(salesAmount>= 20000)
        {
            commission = (salesAmount*10)/100;
        }else if(salesAmount >= 10000)
        {
            commission = (salesAmount*5)/100;
        }else if(salesAmount < 10000 && salesAmount > 1)
        {
            commission = (salesAmount*2)/100;
        }else
        {
            commission = 0;
        }
        System.out.println(commission);

        System.out.print("\n Salary Slip");
        System.out.print("\n------------------------------------------------");
        System.out.print("\n Seller Name \t     : " + name);
        System.out.print("\n Seller ID \t         : "  + salesID);
        System.out.print("\n------------------------------------------------");
        System.out.print("\n Basic Salary \t     : " +salary);
        System.out.print("\n Commission \t \t : " +commission);
        System.out.print("\n---------------------------------");
        double total = salary + commission;
        System.out.println("\n Total Salary \t \t :" +total);

    }
}
