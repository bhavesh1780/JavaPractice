package HomeWork;

/**
 * Created by Dell on 20/02/2017.
 */
public class Reverse
{
    public static void main(String args[])
    {

       String name = "Gamita";
        StringBuilder name1 = new StringBuilder();
        name1.append(name);
        name1=name1.reverse();

        System.out.println(name1);
    }

}
