
// 7. Write a program to calculate the HCF of Two given numbers.

import java.util.Scanner;

public class TaskQn7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        int hcf = calculateHCF(num1, num2);
        
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        
        scanner.close();
    }
    public static int calculateHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
}
