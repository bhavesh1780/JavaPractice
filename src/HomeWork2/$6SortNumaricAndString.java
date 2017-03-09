package HomeWork2;

import java.util.Arrays;

/**
 * Created by Dell on 05/03/2017.
 */
public class $6SortNumaricAndString {
    public static void main(String[] args) {
        int[] number = {45,35,10,50};

        String[] name = {"bhavesh","jayendra","niyam"};

        Arrays.sort(number);
        for (int i = 0; i < number.length ; i++)
        {
            System.out.println(number[i]);
        }
        Arrays.sort(name);
        for (int j = 0; j < name.length ; j++)
        {
            System.out.println(name[j]);
        }

    }
}