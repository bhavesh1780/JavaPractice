package HomeWork;

/**
 * Created by Dell on 20/02/2017.
 */
public class Marks {
    public static void main(String[] args)
    {
        int score = 100;
        if (score > 100 || score < 0)
        {
            System.out.println("mark is not valid");
        } else if (score >= 35 && score <=59)
        {
            System.out.println("Pass");
        } else if (score >= 60 && score <= 69)
        {
            System.out.println("Firstclass");
        }
        else if (score >= 70 && score <=100)
        {
            System.out.println("Distinction");
        } else
        {
            System.out.println("Fail");
        }

    }
}
