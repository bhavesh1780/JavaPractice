package HomeWork;

/**
 * Created by Dell on 19/02/2017.
 */
public class AreaOfCircle {
    static final double pi = 3.145;
    public void radius(double r){
        double area;
        area = pi * r * r;
        System.out.println("if the radius of circle " + r + " then area = " + area);
    }
    public static void main(String[] args) {
        AreaOfCircle c = new AreaOfCircle();
        c.radius(60);
    }

}
