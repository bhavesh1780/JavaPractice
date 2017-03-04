package Practice;

/**
 * Created by Gamitapatel on 02/10/2016.
 */
public class Address {
    public static void main(String[] args) {
        System.out.println("Bhavesh Patel");
        System.out.println("103 Bridgewater Road");
        System.out.println("Wembley");
        System.out.println("Middlesex");
        System.out.println("HA0 1AH");
    }

    /**
     * Created by Gamitapatel on 14/09/2016.
     */
    public static class Calculator {
        int a = 20;        // instance variables
        int b = 5;
        int c;

        public void add (){
            //instance area
            c = a + b;
            System.out.println("The addition of " +a+ " and "+b+ " = "+ c);
        }

        public void substraction(){
            c = a - b;
            System.out.println("The substraction of " +a+ " and "+b+ " = "+ c);
        }
        public static void multiplication(){
            //static area
            Calculator calculator = new Calculator();  //call instance variable in static area by object creation
            calculator.c = calculator.a * calculator.b ;
            System.out.println("The multiplication of " +calculator.a+ " and "+calculator.b+ " = "+ calculator.c);
        }
        public void division(){
            c = a/b;
            System.out.println("The division of " +a+ " and "+b+ " = "+ c);
        }

        public static void main(String[] args) {
            Calculator addition = new Calculator();
            addition.add();
            Calculator.multiplication();
            Calculator calculator1 = new Calculator();
            calculator1.division();
            Calculator calculator = new Calculator();
            calculator.substraction();

        }


    }

    /**
     * Created by Gamitapatel on 02/10/2016.
     */
    public static class Demo {
        public static void main(String[] args) {
            System.out.println("Practice.Address.Demo");

        }
    }

    /**
     * Created by Gamitapatel on 01/09/2016.
     */
    public static class HelloWorld
    {
        public static void main(String[] args) {
            System.out.println("Hello World");
            System.out.println("bhavesh");

        }

    }
}
