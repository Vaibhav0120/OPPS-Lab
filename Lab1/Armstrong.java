package Lab1;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;
        
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3); // Assuming 3 digits for Armstrong check
            num /= 10;
        }
        
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
        
        sc.close();
    }
}
