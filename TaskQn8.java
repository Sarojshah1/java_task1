// 8. Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.
import java.util.Scanner;

public class TaskQn8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int reversedNumber = reverseDigits(number);
        
        System.out.println("Reversed number: " + reversedNumber);
        
        scanner.close();
    }

    // Function to reverse the digits of an integer
    public static int reverseDigits(int num) {
        int reversed = 0;
        
        while (num != 0) {
            int digit = num % 10;   // Get the last digit
            reversed = reversed * 10 + digit;
            num /= 10;              // Remove the last digit
        }
        
        return reversed;
    }
    
}
