package HomeWork2;

/**
 * Created by Dell on 05/03/2017.
 */
public class $15ReverseArrayIntegerValue {
    public static void main(String[] args) {
        int number[] = {35,49,55,75,100};
        System.out.println("\nArray before Reverse : ");

        for (int i = 0; i < number.length; i++)
        {
            System.out.print(number[i] + " ");
        }
        for (int i = 0, j = number.length - 1; i < j; i++, j--)
        {
            int temp = number[i];
            number[i] = number[j];
            number[j] = temp;
        }
        System.out.println("\nArray after reverse:");
        for (int i = 0; i < number.length; i++)
        {
            System.out.print(number[i] + " ");
        }
        }
    }
