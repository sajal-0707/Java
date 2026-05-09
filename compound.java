import java.util.Scanner;
public class compound
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        double principal;
        double rate;
        int timescom;
        int year;
        double amount;
        System.out.print("Enter the principle amount= ");
        principal= scanner.nextDouble();
        System.out.print("Enter the interest rate(in %)= ");
        rate= scanner.nextDouble() / 100;
        System.out.print("Enter the number of times compounded per year= ");
        timescom= scanner.nextInt();
        System.out.print("Enter the number of years= ");
        year= scanner.nextInt();
        amount= principal * Math.pow(1+(rate/timescom),timescom*year );
        System.out.printf("the amount after %d years is %.2f",year,amount);
        scanner.close();
    }
}
