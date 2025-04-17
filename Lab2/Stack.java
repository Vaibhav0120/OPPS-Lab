package Lab2;

import java.util.Scanner;

public class Stack {
    int top;
    int stk[];
    public Stack(int size) {
        top = -1;
        stk = new int[size];
    }

    void push(int item){
        if(top == 5) {
            System.out.println("Stack is full");
        } else {
            top++;
            stk[top] = item;
        }
    }

    int pop(){
        if(top == -1) {
            System.out.println("Stack is empty"); return 0;
        } else {
            int temp = stk[top];
            top=top-1;
            return temp;
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        Stack s1 = new Stack(5);
        System.out.println("Enter 5 numbers to push into the stack:");
        for(int i=0; i<5; i++){
            System.out.print("Enter number " + (i+1) + ": ");
            num = sc.nextInt();
            s1.push(num);
        }

        System.out.println("Popping elements from the stack:");
        for(int i=0; i<5; i++){
            System.out.println(s1.pop());
        }
        sc.close();
    }
}
