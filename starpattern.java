public class starpattern {
    public static void main (String[]args)
    {
    int i,j,k,space;
    space=3;
    for(i=1;i<=4;i++)
    {
        for(j=1;j<=space;j++)
        {
            System.out.print(" ");
        }
    
        for(k=1;k<=(2*i-1);k++)
        {
            System.out.print("*");
        }
        space--;
        System.out.println();
        
    }
}
}