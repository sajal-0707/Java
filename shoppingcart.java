//Shopping cart program
import java.util.Scanner;
public class shoppingcart 
{
     public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.print("What item would you like to buy? = ");
        String item= scanner.nextLine();
        System.out.print("What is the price for each= ");
        double price= scanner.nextDouble();
        System.out.print("How any would you like to buy?= ");
        double qun= scanner.nextDouble();
        System.out.print("You bought " + qun +" "+ item +"/s" );
        System.out.print("Your total is "+ qun*price);
        scanner.close();
    }
}