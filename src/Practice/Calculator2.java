package Practice;

/**
 * Created by Dell on 04/03/2017.
 */
public class Calculator2 extends Calculator {

    public void subtraction(){
        int ans = a - b;
        System.out.println("subtraction" +ans);
    }


    public static void main(String[] args) {
        Calculator2 calculator2 = new Calculator2();
        calculator2.subtraction();
        calculator2.addition();  // coming from parent class - will be as it is
    }
}
