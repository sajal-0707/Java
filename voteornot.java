//value taken from user
import java.util.Scanner;
public class voteornot 
{
    public static void main(String[]args){
    Scanner obj= new Scanner(System.in);
    System.out.print("Enter your age = ");
    int age= obj.nextInt();
    if(age>=18)
    {
        System.out.println("can vote");
    }
    else
    {
        System.out.println("can not vote");
    }
}
}