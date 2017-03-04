package HomeWork;

/**
 * Created by Dell on 19/02/2017.
 */
public class Calculator {
    public int a;         //Instance Variable
    public int b;
    public int ans;

    public void add(int a, int b){
        ans = a + b;
        System.out.println("the addition of " + a + " and " + b + " = " + ans);
    }
    public void substraction(int a, int b){
        ans = a - b;
        System.out.println("the substraction of " + a + " and " + b + " = " + ans);
    }

    public static void multiplication(int a, int b){
        Calculator calculator = new Calculator();  //called instance variable in static area by creating object
        calculator.ans = calculator.a * calculator.b;
        System.out.println("the multiplication of " + calculator.a + " and " + calculator.b + " = " + calculator.ans);
    }
    public void division(int a, int b){
        ans = a / b;
        System.out.println("the division of " + a + " and " + b + " = " + ans);
    }

    public static void main(String[] args) {
    Calculator addition = new Calculator();
    addition.add(50,100);
    Calculator.multiplication(45,60);
    Calculator calculator1 = new Calculator();
    calculator1.division(5000,250);
    Calculator calculator = new Calculator();
    calculator.substraction(490,124);
    }

}
