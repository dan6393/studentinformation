import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        // Create an object of the Scanner class
        Scanner input = new Scanner(System.in);

        // Declare variables for storing name and age
        String name;
        int age;

        // Ask the user to enter their name
        System.out.println("Enter the student's name:");
        name = input.nextLine();

        // Ask the user to enter their age
        System.out.println("Enter the student's age:");
        age = input.nextInt();

        // Echo the student's name and age
        System.out.println("Student's name is: " + name);
        System.out.println("Student's age is: " + age);

    }
}