package hw07new;
//Write a program that tells us input value is number or an alphabet or symbol.

import java.util.Scanner;

public class Program12 {//class name

    public static void main(String[] args) {//main method
        Scanner s = new Scanner(System.in);//create object for scanner class
        System.out.println("Enter any character");//print statement
        char x = s.next().charAt(0);//read user input
        checkIfSymbol(x);

    }

    public static void checkIfSymbol(char x) {//static method
        if (x >= 'a' && x <= 'z') {//if-else condition
            System.out.println("Alphabet");//print statement
        } else if (x >= '0' && x <= '9') {
            System.out.println("Number");
        } else {
            System.out.println("Symbol");
        }
    }
}
