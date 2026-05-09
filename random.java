import java.util.Random;
public class random
{
    public static void main(String[] args)
    {
        Random random= new Random();
        //Range not given
        int number= random.nextInt();
        System.out.println(number);
        //Range is given
        int number2= random.nextInt(1,10+1);//the range works as 1 to n-1 so to get 10 we have to put 11 or 10+1 eventually 11
        System.out.println(number2);
    }
}