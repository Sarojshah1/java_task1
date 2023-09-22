// 10. Write a program that asks the user for a positive nonzero integer value. The program should use a loop to get the sum of all the integers from 1 up to the number entered. For example, if the user enters 50, the loop will find the sum of 1+2+3+4+….+50.
import java.util.Scanner;
public class TaskQn10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=0;
        System.out.println("enter a number that you want to sum");
        int a=scanner.nextInt();
        for (int i=0; i<=a; i++) {
            num=num+i;

        }
        System.out.println("the sum of "+a+" is "+num);
    }
    
    
}
