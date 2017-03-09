package HomeWork2;

/**
 * Created by Dell on 04/03/2017.
 */
public class $7SumOfValueArray
{
    public static void main(String[] args)
    {
        int[] number = {20, 40, 50, 70, 10};
        int sum = 0;

        for (int i = 0; i < number.length; i++)
        {
            sum = sum + number[i];
        }
        System.out.println(sum);
    }
}