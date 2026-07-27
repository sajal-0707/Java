import java.util.Scanner;
public class lastdigit
{
    public static void main(String[] args)
    {
    Scanner scanner= new Scanner(System.in);
    System.out.print("Enter a number = ");
    int a= scanner.nextInt();
    int b=a%10;
    System.out.println(b);
    }
}
