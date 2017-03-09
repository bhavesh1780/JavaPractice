package HomeWork2;

/**
 * Created by Dell on 06/03/2017.
 */
public class $17DuplicateArrayStringValue
{
    public static void main(String[] args)
    {
        String[]name = {"jagdish","gamita","arohi","aarya","gamita","arohi","vipul"};

        for (int i = 0; i <name.length ; i++)
        {
            for (int j = i+1; j <name.length ; j++)
            {
            if((name[i].equalsIgnoreCase(name[j])))
            {
                System.out.println("\nDuplicate Names in Arrays are : " +name[j]);
            }
            }
        }
    }
}
