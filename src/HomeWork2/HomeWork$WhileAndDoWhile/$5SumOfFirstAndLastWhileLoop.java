package HomeWork2.HomeWork$WhileAndDoWhile;

import java.util.Scanner;

/**
 * Created by Dell on 08/03/2017.
 */
public class $5SumOfFirstAndLastWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter any five digits :- ");
        int x = scanner.nextInt();
        int a,sum=0,b=0;

        while (x>0)
        {
            a=x%10;  // separating the reminder from the value
            b++;

            if(b==1||b==5)
            {
                sum=sum+a;
            }
            x=x/10;
        }
        System.out.println("\nSum of First and Last Digit is :" +sum);
    }
}
