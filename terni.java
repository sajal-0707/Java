//Pass or fail using ternary operator
import java.util.Scanner;
public class terni
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter your Percentage = ");
        double per= scanner.nextDouble();
        String result= (per>33)? "Pass":"Fail";
        System.out.println(result);
        scanner.close();
    }
}
