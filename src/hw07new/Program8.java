package hw07new;
//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any other alphabet should be invalid entry

import java.util.Scanner;

public class Program8 {//class name

    public static void main(String[] args) {//main method
        char letter;//instance method
        Scanner s = new Scanner(System.in);//create object for scanner class
        System.out.println("Enter any alphabet from A to F");//print statement
        letter = s.next().charAt(0);//read the first character

        cities(letter);
    }

    public static void cities(char letter) {//static method
        if (letter == 'A') {//if-else condition
            System.out.println("Atlanta");//print statement
        } else if (letter == 'B') {
            System.out.println("Baroda");
        } else if (letter == 'C') {
            System.out.println("Chicago");
        } else if (letter == 'D') {
            System.out.println("Durham");
        } else if (letter == 'E') {
            System.out.println("Edinburgh");
        } else if (letter == 'F') {
            System.out.println("Faridabad");
        } else {
            System.out.println("Invalid Entry");
        }
    }
}

