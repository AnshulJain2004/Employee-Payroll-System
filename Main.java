import java.util.Scanner;

// Define a class named Main
public class Main {
    // Main method, entry point of the program
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to specify if the employee is a bonus employee or not
        System.out.println("Is this employee a bonus employee? (yes/no): ");
        // Read the user's choice from the input
        String choice = scanner.next();

        // Check if the user's choice is "yes"
        if (choice.equalsIgnoreCase("yes")) {
            // If yes, prompt the user to enter the monthly bonus amount
            System.out.println("Enter monthly bonus amount: ");
            // Read the bonus amount from the input
            double bonusAmount = scanner.nextDouble();
            // Create a BonusEmployee object with the provided bonus amount
            BonusEmployee b = new BonusEmployee("John Doe", "123 Street, City", 2000, bonusAmount);
            // Call the method to display employee details
            b.getEmployeeDetails();
            // Call the method to calculate and display the salary
            b.salaryCalculation();
        } else {
            // If the user's choice is not "yes", assume the employee is a normal employee
            // Create a NormalEmployee object
            NormalEmployee n = new NormalEmployee();
            // Call the method to display employee details
            n.getEmployeeDetails();
            // Call the method to calculate and display the salary
            n.salaryCalculation();
        }
    }
}