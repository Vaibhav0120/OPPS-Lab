package Lab1;

import java.util.Scanner;

public class Reverse {
    //ask user for int and reverse the number using loop
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();
        int reversedNum = 0;
        
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        
        System.out.println("The reversed number is: " + reversedNum);
        sc.close();
    }
}
