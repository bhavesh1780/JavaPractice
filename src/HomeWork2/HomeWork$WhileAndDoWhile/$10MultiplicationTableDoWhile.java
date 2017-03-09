package HomeWork2.HomeWork$WhileAndDoWhile;

/**
 * Created by Dell on 07/03/2017.
 */
public class $10MultiplicationTableDoWhile {
    public static void main(String[] args) {
        int row, column,y;
        System.out.println("Multiplication Table \n ");
        row = 1;

        do {
            column = 1;
            do {
                y = row * column;
                System.out.print(" " + y);
                column = column + 1;
            }

            while (column <= 6);
            System.out.println("\n");
            row = row + 1;
        }
        while (row <= 6);
    }
}
