package Tution;

/**
 * Created by Dell on 18/02/2017.
 */
public class HelloWorld
{
    //Instance area
    static int z;   //instance variable

    public static void addition (int a, int b){ //user defined method
        //int a, int b local variable
        //local area
        z = a+b;
    }

    static void subtraction(){
        //static area
    }


    public static void main(String[] args) {
        // write syntex 20 times public static void main (String args[])
        int x; //ststic variable
        //Static area
        System.out.print("Hi");
        System.out.println("My Name is Bhavesh");
        System.out.println("I leave in UK");
        HelloWorld.subtraction();
    }
}
