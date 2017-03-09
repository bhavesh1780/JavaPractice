package HomeWork;

/**
 * Created by Dell on 19/02/2017.
 */
public class Temperature {
    public void temp(int f){
        double c;
        c = (f - 32) * 5/9;
        System.out.printf("if temp = " + f + "Fahrenheit then temp = " + c + " Celsius");
    }

    public static void main(String[] args) {
        Temperature t = new Temperature();
        t.temp(180);
    }

    /**
     * Created by Dell on 19/02/2017.
     */
    public static class Calculator1
        {
        int a;         //Instance Variable
        int b;
        int ans;

        public void add(int a,int b){
            ans = a + b;
            System.out.println("the addition of " + a + " and " + b + " = " + ans);
        }
        public void sub(int a, int b)
        {
            ans = a - b;
            System.out.println("the substraction of " + a + " and " + b + " = " + ans);
        }
        public static void multi(int a, int b)
        {
            Calculator1 mul = new Calculator1();
            mul.ans = a * b;
            System.out.println("the multiplication of " + a + " and " + b + " = " + mul.ans);
        }
        public static void division(double a, double b)
        {
            double d;
            d = a/b;
            System.out.println("the division of " + a + " and " + b + " = " +d);
        }
        public static void main(String[] args)
        {
            Calculator1 cal = new Calculator1();
            cal.add(300, 500);
            cal.sub(800 , 500);
            cal.multi(50, 20);
            cal.division(10, 3);
        }

    }
}
