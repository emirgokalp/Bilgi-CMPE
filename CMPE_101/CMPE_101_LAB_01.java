import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Basic printing examples
        System.out.println("Hello World");
        System.out.print("Bilgi\t ");
        System.out.println("University");
        System.out.println("He said \"Java is fun\"");

        int age = 18;
        System.out.printf("I am %d years old\n", age);

        // Create scanner object
        Scanner scanner = new Scanner(System.in);

        // Ask user for age
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        // Ask user for name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Print name and age
        System.out.println("Name: " + name + " Age: " + age);

        // Ask for two numbers
        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter another number: ");
        int num2 = scanner.nextInt();

        // Print the numbers
        System.out.println("Numbers: " + num1 + " and " + num2);

        // Close scanner
        scanner.close();
    }
}
