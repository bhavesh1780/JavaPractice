package HomeWork2.HomeWork$WhileAndDoWhile;

import java.util.Scanner;

/**
 * Created by Dell on 08/03/2017.
 */
public class $3EvenAndOddAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter any five digits :- ");
        int x = scanner.nextInt();
        int a,oSum=0,b=0,eSum=0,c=0;

        while (x>0)
        {
            a=x%10;

            if(a%2 ==0)
            {
                eSum=eSum+a;
                b++;
            }else if (a%3 ==0)
            {
                oSum=oSum+a;
                c++;
            }
            x=x/10;
        }
        System.out.println("\nThe Number of Even Digit is :" +b+" Its Sum is :" +eSum);
        System.out.println("\nThe Number of Odd Digit is :" +c+" Its Sum is :" +oSum);
    }
}
