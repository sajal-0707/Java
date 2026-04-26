import java.util.Scanner; 
public class prac {
    public static void main(String[]args)
    {
        Scanner obj= new Scanner(System.in);
        System.out.print("entn=");
        String a= obj.nextLine();
        System.out.println(a);
        System.out.print("age=");
        int b= obj.nextInt();
System.out.println(b);
        obj.close();
    }
}
