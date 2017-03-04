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

}
