package Practice;

/**
 * Created by Gamitapatel on 01/09/2016.
 */
public class StaticVariables {
    int a=1000;
    int b=2000;
    public static void main(String[]args)
    {
        StaticVariables staticVariables = new StaticVariables();
        System.out.println(staticVariables.a);
        System.out.println(staticVariables.b);
        staticVariables.m1();
    }

    void m1()
    {
        System.out.println(a);
        System.out.println(b);
    }

}