import java.util.Scanner;
public class existance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name= ");
        String name = scanner.nextLine();
        System.out.print("Enter your age= ");
        int age = scanner.nextInt();
        System.out.print("Are you a student?(true/false)= ");
        Boolean student = scanner.nextBoolean();
        scanner.nextLine();

        if(name.isEmpty()) {
            System.out.println("name not entered");
        } else {
            System.out.println("Your name is " + name);
        }

        if(age >= 18)
            System.out.println("You are an adult and you are " + age + " years old");
        if(age < 18)
            System.out.println("You are a minor and you are " + age + " years old");

        if(student) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
            System.out.print("Do you have a job?(yes/no)= ");
            String choice = scanner.nextLine();
            if(choice.equals("yes"))
                System.out.println("You are employed ");
            else
                System.out.println("You are unemployed ");
        }
    }
} 