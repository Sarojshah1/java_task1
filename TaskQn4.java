// 4. Write a program that reads the width and generates a corresponding square of *. For example, if width = 5, output is:

// *****

// *****

// *****

// *****

// *****
import java.util.Scanner;
public class TaskQn4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        for (int i = 0; i <a;i++) {
            System.out.println("******");
        }
    }
    
}
