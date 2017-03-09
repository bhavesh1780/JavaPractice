package Practice;

import java.util.Scanner;

/**
 * Created by Dell on 08/03/2017.
 */
public class PrimeNumberWhileLoop {
    public static void main(String[] args) {
        int no, flag = 0, a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter any no: ");
        no = scanner.nextInt();
        a=1;
        while(a<=no)
        {
            flag=0;
            b=2;
            while(b<=a>>1)
            {
                if(a%b==0)
                {   flag = 1;
                    break;
                }
                b++;
            }
            if(flag==0)
            {   System.out.println("Prime number" + a);
            }
            else
            {   System.out.println("Not Prime number" + a);
            }
            a++;
        }
    }
}
