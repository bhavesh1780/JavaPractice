package HomeWork2;

/**
 * Created by Dell on 05/03/2017.
 */
public class $9AverageValue {
    public static void main(String[] args) {
        int[]number = new int[]{40,60,70,32,50};
        int sum = 0;

        for (int i = 0; i < number.length ; i++)
            sum = sum + number[i]/number.length;
//        double average = sum/number.length;
        System.out.println("\nAverage Value of Array Element is : " +sum);

    }
}
