// 9. Write a program that reads ten integer numbers and outputs the number of inputs which are greater than 50, less than 50 or equal to 50. The program should also display the average of all numbers greater than 50 and the average of all numbers less than 50.
import java.util.Scanner;
public class TaskQn9 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int countGreater = 0;
        int countLess = 0;
        int countEqual = 0;
        int sumGreater = 0;
        int sumLess = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();

            if (num > 50) {
                countGreater++;
                sumGreater += num;
            } else if (num < 50) {
                countLess++;
                sumLess += num;
            } else {
                countEqual++;
            }
        }

        System.out.println("Numbers greater than 50: " + countGreater);
        System.out.println("Numbers less than 50: " + countLess);
        System.out.println("Numbers equal to 50: " + countEqual);

        if (countGreater > 0) {
            double avgGreater = (double) sumGreater / countGreater;
            System.out.println("Average of numbers greater than 50: " + avgGreater);
        } else {
            System.out.println("No numbers greater than 50 entered.");
        }

        if (countLess > 0) {
            double avgLess = (double) sumLess / countLess;
            System.out.println("Average of numbers less than 50: " + avgLess);
        } else {
            System.out.println("No numbers less than 50 entered.");
        }

        scanner.close();
    }
    
}
