package hw07new;
//Write a Java program which input any number between 1 to 7 and it print The Days
//name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {//main method
        int a;//instance variable
        Scanner s = new Scanner(System.in);//create object for scanner class
        System.out.println("Enter number");
        a = s.nextInt();

        days(a);
    }

    public static void days(int a) {//static method
        switch (a) {//switch statement syntax

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invaild. Week contains 1 to 7 days");//print statement

        }
    }
}
