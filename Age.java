
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        
if (age <= 0) {
    System.out.println("Invalid age. Please enter a positive number.");
} else if (age < 18) {
    System.out.println("You are underage.");
} else {
    System.out.println("You are an adult.");
}

        input.close();
    }
}