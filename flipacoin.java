import java.util.Random;
public class flipacoin 
{
    public static void main(String[] args)
    {
        Random random= new Random();
        Boolean num= random.nextBoolean();
        if(num)
        {
            System.out.println("head");
        }
        else
        {
            System.out.println("Tails");
        }
    }
}
