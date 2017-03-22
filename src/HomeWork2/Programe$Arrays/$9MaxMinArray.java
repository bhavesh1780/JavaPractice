package HomeWork2.Programe$Arrays;

import java.util.Arrays;

/**
 * Created by Dell on 05/03/2017.
 */
public class $9MaxMinArray {
    public static void main(String[] args) {
        int number[] = new int[]{10, 11, 88, 2, 12, 120};
        Arrays.sort(number);
        System.out.println("Minimum = " +number[0]);
        System.out.println("Maximum = " +number[number.length-1]);
    }
}
