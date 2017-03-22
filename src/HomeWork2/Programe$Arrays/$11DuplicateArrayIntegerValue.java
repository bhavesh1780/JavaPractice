package HomeWork2.Programe$Arrays;

import java.util.Arrays;

/**
 * Created by Dell on 05/03/2017.
 */
public class $11DuplicateArrayIntegerValue {
    public static void main(String[] args) {
        int[]numbers = {5,15,30,10,5,15,25,35,50,10,100,75};
        Arrays.sort(numbers);

        for (int i = 1; i < numbers.length ; i++)
        {
            if(numbers[i] == numbers[i-1] ){
                System.out.println("Duplicate Arrays are : " +numbers[i]);
            }
        }
    }
}
