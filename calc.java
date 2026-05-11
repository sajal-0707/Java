//Calculator using Switches
import java.util.Scanner;
public class calc
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a number= ");
        double num1= scanner.nextDouble();
        System.out.print("Enter a operator(+, -, *, /, %)= ");
        char operator= scanner.next().charAt(0);
        System.out.print("Enter another number= ");
        double num2= scanner.nextDouble();
        switch (operator) {
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                if(num2==0)
                {
                    System.out.println("Can not divide my zero");
                    break;
                }
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Wrong operator");
                break;
        }
        scanner.close();
    }
}
