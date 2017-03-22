package HomeWork2.Programe$Arrays;

/**
 * Created by Dell on 06/03/2017.
 */
public class $15SecondLargestElementArray {
    public static void main(String[] args) {
        int number[] = { 30,10,25,100,75,66,150,90,130 };
        int large = number[0];
        int large1 = number[0];

        System.out.println("\nElements in Array are :" );
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+"\t");
        }
        for (int i = 0; i < number.length; i++) {

            if (number[i] > large) {
                large1 = large;
                large = number[i];

            } else if (number[i] > large1) {
                large1 = number[i];

            }
        }

        System.out.println("\nSecond largest element in Array is :" + large1);
    }
}
