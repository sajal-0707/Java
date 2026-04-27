import java.util.Scanner;
public class perameterofrec {
    public static void main(String[]args)
    {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter length of rectangle= ");
        int a= obj.nextInt();
        System.out.print("Enter breadth of rectangle= ");
        int b= obj.nextInt();
        int c= 2*(a*b);
        System.out.println(c);
    }
}