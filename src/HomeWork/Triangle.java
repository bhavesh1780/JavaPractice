package HomeWork;

/**
 * Created by Dell on 19/02/2017.
 */
public class Triangle {
    public static void triangle(double h, double b)
    {
        double a;
        a = (h * b)/ 2;
        System.out.println("if height h = " + h + " and  base b = " + b + " then area of triangle = " +a);
    }

    public static void main(String[] args) {
        Triangle.triangle(6,3);
    }
}
