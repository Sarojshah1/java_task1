// 5. Modify the above program by using a do..while loop so that it provides the user with the option to continue running the program and enter more inputs. For example:

// Sample Run:

// Enter a positive non-zero integer 4

// Sum of 1 to 4 is 10

// Do you want to continue? Enter ‘y’ for yes or any other character for no.

// y

// Enter a positive non-zero integer 3

// Sum of 1 to 3 is 6

// Do you want to continue? Enter ‘y’ for yes and any other character for no.

// n.
import java.util.Scanner;

public class TaskQn5 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a positive non-zero integer: ");
            int n;
            try {
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Please enter a positive non-zero integer.");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a positive non-zero integer.");
                scanner.nextLine(); // Consume the invalid input
                continue;
            }

            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println("Sum of 1 to " + n + " is " + sum);

            System.out.print("Do you want to continue? Enter 'y' for yes or any other character for no: ");
            char choice = scanner.next().charAt(0);
            if (choice != 'y' && choice != 'Y') {
                break;
            }
        } while (true);

        scanner.close();
    }
    
}
