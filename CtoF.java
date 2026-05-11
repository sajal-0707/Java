import java.util.Scanner;
public class CtoF
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        double temp, newtemp;
        String unit; 
        System.out.print("Enter temperature = ");
        temp= scanner.nextDouble();
        System.out.print("Convert to C or F (F/C)= ");
        unit= scanner.next().toUpperCase();
        newtemp= (unit.equals("C"))? (temp-32)* 5/9 : (temp * 5/9)+32;
        System.out.printf("%.1f°%s",newtemp,unit);
        scanner.close();
    }
}