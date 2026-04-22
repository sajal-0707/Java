public class reversestarstairs {
    public static void main(String[]srgs)
    {
        int i,j,n=5;
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
