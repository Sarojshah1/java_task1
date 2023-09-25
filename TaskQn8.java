// 8. Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.
import java.util.Scanner;

public class TaskQn8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
         int reversed = 0;
        
        while (number != 0) {
            int digit = number % 10;   
            reversed = reversed * 10 + digit;
            number /= 10;              
        }
        
        System.out.println("Reversed number: " + reversed);
        
        scanner.close();
    }


    
}
