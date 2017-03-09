package HomeWork2;

/**
 * Created by Dell on 06/03/2017.
 */
public class $18CommonElementBetweenArray {
    public static void main(String[] args) {
        int[]number = {10,50,30,45,75,65,100,120};
        int[]number1 = {75,80,10,45,60,35,90,100};

        for (int i = 0; i <number.length ; i++)
        {
            for (int j = 0; j <number1.length ; j++)
            {
            if(number[i] == number1[j])
            {
                System.out.println(+number[i]);
            }
            }    
        }
    }
}
