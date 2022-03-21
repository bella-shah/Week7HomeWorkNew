package hw07new;
//Write a java program to input any two number and ask user to enter their symbol (+, - , /, *)

import java.util.Scanner;

public class Program10 {//class name

    public static void main(String[] args) {//main method
        char x;//instance variable
        int num1;
        int num2;

        Scanner s = new Scanner(System.in);//create object for scanner class
        System.out.println("Enter first number");//print statement
        num1 = s.nextInt();//read user input
        System.out.println("Enter second number");
        num2 = s.nextInt();
        System.out.println("Enter the operator");
        x = s.next().charAt(0);

        operators(x, num1, num2);
    }

    public static void operators(char x, int num1, int num2) {//static method

        if (x == '+') {//if-else condition
            System.out.println("Sum is: " + (num1 + num2));//print statement
        } else if (x == '-') {
            System.out.println("Difference is: " + (num1 - num2));
        } else if (x == '*') {
            System.out.println("Multiplication is: " + (num1 * num2));
        } else if (x == '/') {
            System.out.println("Division is: " + (num1 / num2));
        } else {
            System.out.println("Invalid Operator entered");
        }
    }
}
