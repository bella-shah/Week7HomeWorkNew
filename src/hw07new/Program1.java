package hw07new;
//Write a java program that tells us that Input number is odd

import java.util.Scanner;

public class Program1 {// class name

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);// create object scanner class
        System.out.println("Enter a number : ");//print statement
        int num = s.nextInt();//read user input
        String evenOrOdd = (num % 2 == 0 ? "Even" : "Odd");//method for odd/even
        System.out.println("Input Number " + num + " is " + evenOrOdd);//print statement

    }
}

