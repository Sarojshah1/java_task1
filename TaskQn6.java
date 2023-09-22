// 6. Write a program that reads the width and generates a corresponding triangle of *. For example, if width = 5, output is:

// *

// **

// ***

// ****

// *****
import java.util.Scanner;

public class TaskQn6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Width");
        int width = scanner.nextInt();
        for (int i=1;i<=width;i++) {
            for (int j=0;j<i;j++) {
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
    
}
