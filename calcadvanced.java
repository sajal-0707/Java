//Calculator using advanced switch statement
import java.util.Scanner;
public class calcadvanced
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a number = ");
        double num1= scanner.nextDouble();
        System.out.print("Enter a operator(+, -, *, /, %) = ");
        char operator= scanner.next().charAt(0);
        System.out.print("Enter another number = ");
        double num2= scanner.nextDouble();
        double result=0;
        boolean veri= true;
        switch (operator)
        {
            case '+' -> result = num1+num2;
            case '-' -> result = num1+num2;
            case '*' -> result = num1*num2;
            case '/' -> {
                if(num2==0)
                {
                    System.out.println("Can not divide by zero");
                    veri= false;
                }
                else
                {
                    result = num1/num2;
                }
            }
            case '%' -> result = num1%num2;
            default -> {
                System.out.println("Invalid operator");
                veri= false;
            }
        }
        if(veri){
        System.out.println(result);
        }
        scanner.close();
    }
}
