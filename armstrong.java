import java.util.Scanner ;
public class armstrong
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        int n=0 ;
        int tot=0;
        System.out.print("Enter a number = ");
        int a = scanner.nextInt();
        int ori = a;
        int temp=ori;
        for(int i=ori;i>0;i/=10)
        {
            n++;
        }
        for (int i=n;i>0;i--)
        {
            int last=temp%10;
            tot+=(int)Math.pow(last,n);
            temp/=10;
        }
        System.out.println(tot);
        if (tot == ori)
        {
            System.out.println(ori + " is an Armstrong number");
        }
        else
        {
                System.out.println(ori + " is not an Armstrong number");
        }
        scanner.close();
    }
}
