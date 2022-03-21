package hw07new;
//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”

import java.util.Scanner;

public class Program16 {

    public static void main(String[] args) {//main method
        int a;
        Scanner s = new Scanner(System.in);//create object for scanner class
        System.out.println("Enter any number");//print statement
        a = s.nextInt();

        checkNum(a);
    }

    public static void checkNum(int a) {
        if (a == 0) {//if-else condition
            System.out.println("ZERO");//print statement
        } else if (a > 0) {
            System.out.println("POSITIVE");//print statement
        } else {
            System.out.println("NEGATIVE");
        }
    }
}

