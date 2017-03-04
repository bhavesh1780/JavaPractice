package Tution;

import java.util.Scanner;

/**
 * Created by Dell on 25/02/2017.
 */
public class City {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(("Enter Tution.City Name"));
        String cityname = input.next();
        String london = "London";

//        if (cityname.equalsIgnoreCase("London")) {
//            System.out.println("You are in UK");
//        } else if (cityname.equalsIgnoreCase("Ahmedabad")) {
//            System.out.println("You are in India");
//        } else if (cityname.equalsIgnoreCase("Tokyo")) {
//            System.out.println("Your are in Japan");
//        } else if (cityname.equalsIgnoreCase("New York")) {
//            System.out.println("Your are in usa");
//        } else
//            System.out.println("Wrong Tution.City Name Entered");
//
//    }

    if (cityname == london){
        System.out.println("You r in uk");
    }
    else if (cityname == "Ahmedabad"){
        System.out.println("You r in India");
    }
    else {
        System.out.println("Wrong cityname");
    }
    }
}
