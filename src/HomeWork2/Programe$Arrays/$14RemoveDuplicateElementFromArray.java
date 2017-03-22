package HomeWork2.Programe$Arrays;

/**
 * Created by Dell on 06/03/2017.
 */
public class $14RemoveDuplicateElementFromArray {
    public static void main(String[] args) {
        int[]number = {10,15,10,20,25,40,45,50,55,40};
        int size = number.length;
        System.out.println("\nElement before removing Duplicate: " + size);

        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (number[i] == number[j])
                {
                    while (j < (size) - 1)
                    {
                        number[j] = number[j + 1];
                        j++;
                    }
                    size--;
                }
            }
        }
        System.out.println("Element after removing Duplicate: " + size);
        for (int k = 0; k < size; k++)
        {
            System.out.println(number[k]);
        }
    }

}
