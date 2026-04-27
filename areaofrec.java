//Area of rectangle
import java.util.Scanner;
public class areaofrec {
    public static void main(String[]args)
    {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the length of rectangle= ");
        int a=obj.nextInt();
        System.out.print("Enter the breadth of rectangle=");
        int b=obj.nextInt();
        System.out.println(a*b);
    }
}
