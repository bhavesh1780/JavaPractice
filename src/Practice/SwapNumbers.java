package Practice;

/**
 * Created by Gamitapatel on 14/09/2016.
 */
public class SwapNumbers {
    int a = 10, b = 80;
    int temp;
// use third variable to swap the values
    public void swapping(){
        temp = a;
        a = b;
        b = temp;
        System.out.println("The value of a after swapping is = " +a);
        System.out.println("The value of b after swapping is = " +b);
    }
 // second way to swap the numbers wothout using third variable
    public void swapping2(){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("The value of a after swapping again is = " +a);
        System.out.println("The value of b after swapping again is = " +b);


    }
    public static void main(String[] args) {

        SwapNumbers swapNumbers = new SwapNumbers() ;
        swapNumbers.swapping();
        swapNumbers.swapping2();
    }
}
