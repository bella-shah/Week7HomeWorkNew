package hw07new;
//Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class Program6 {//class name
    int a;

    public static void main(String[] args) {//main method
        int a;//instance variable
        Scanner s = new Scanner(System.in);//created object for scanner class
        System.out.println("Enter number: ");//print statement
        a = s.nextInt();
        oddEven(a);

    }

    public static void oddEven(int a) {//static variable method
        if (a % 2 == 0) {//if statement
            System.out.println("Even");//print statement
        } else {
            System.out.println("Odd");//print statement
        }

    }
}

