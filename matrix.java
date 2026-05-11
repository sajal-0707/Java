import java.util.Scanner;
public class matrix
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter number of columns= ");
        int columns= scanner.nextInt();
        System.out.print("Enter number of rows= ");
        int rows= scanner.nextInt();
        System.out.print("Enter the symbol tou want to fill in the matrix= ");
        char symbol= scanner.next().charAt(0);
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=columns;j++)
            {
                System.out.print(symbol+" ");
            }
            System.out.println("");
        }
        scanner.close();
    }
}
