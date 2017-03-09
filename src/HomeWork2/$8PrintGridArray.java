package HomeWork2;

/**
 * Created by Dell on 04/03/2017.
 */
public class $8PrintGridArray {
    public static void main(String[] args) {
       char[][] x = new char[10][10];

        for (int i = 0; i < 10 ; i++)
        {
            for (int j = 0; j < 10 ; j++)
            {
                x[i][j] = '-';
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}
