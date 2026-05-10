//Even or odd using ternary operator
import java.util.Scanner;
public class evorodd
{
    public static void main(String[]args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num= scanner.nextInt();
        String ans= (num%2==0)? "Even":"Odd";
        System.out.println(ans);
        scanner.close();
    }
}
