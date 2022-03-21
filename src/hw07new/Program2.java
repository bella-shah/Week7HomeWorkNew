package hw07new;
//Write a java program to input any year like (ex.2007) and find out if it is leap year or not?

import java.util.Scanner;

public class Program2 {//class name

    public static void main(String[] args) {//main method
        int year;//Instance variable
        System.out.println("Enter the year : ");//print statement
        Scanner s = new Scanner(System.in);//created an object for the scanner class
        year = s.nextInt();//read user input
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))//this is the formula for leap year-- if-else condition
            System.out.println("This Year is a Leap Year ");//print statement
        else
            System.out.println("This Year is not a Leap Year ");
    }
}



