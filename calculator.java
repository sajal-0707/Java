import java.util.Scanner;
public class calculator {
    public static void main (String[]args)
    {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter a number= ");
        int a= obj.nextInt();
        System.out.print("Enter a number= ");
        int b= obj.nextInt();
        obj.nextLine();
        System.out.print("Enter an operator(+,-,*,/)= ");
        String c= obj.nextLine();
        if(c.equals("+"))
        {
            System.out.println(a+b);
        }
        else if(c.equals("-"))
        {
            System.out.println(a-b);
        }
        else if(c.equals("*"))
        {
            System.out.println(a*b);
        }
        else if(c.equals("/"))
        {
            System.out.println(a/b);
        }
    }
}