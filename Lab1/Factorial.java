package Lab1;

import java.util.Scanner;

public class Factorial {
    //ask user input and calculate factorial of the number using loop
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int num = sc.nextInt();
        int fact = 1;
        
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        
        System.out.println("The factorial of " + num + " is: " + fact);
        sc.close();
    }
}
