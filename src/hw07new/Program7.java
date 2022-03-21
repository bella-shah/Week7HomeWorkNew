package hw07new;
//Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
import java.util.Scanner;

public class Program7 {//class name

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        // input Sales Id
        System.out.println("Input Sales Id: ");
        int Id = scr.nextInt();
        //input the seller's name
        System.out.println("Input Seller's name: ");
        String Name = scr.next();
        //Input basic salary
        System.out.println("Input basic Salary");
        double Salary = scr.nextDouble();
        //input sales amount
        System.out.println("Input sales amount: ");
        double Amount = scr.nextDouble();


        if (Amount >= 50000) {//if-else condition
            System.out.println("Sales Commission is 35%");
        } else if (Amount >= 30000) {
            System.out.println("Sales Commission is 20%");
        } else if (Amount >= 20000) {
            System.out.println("Sales Commission is 10%");
        } else if (Amount >= 10000) {
            System.out.println("Sales Commission is 5%");
        } else if (Amount < 10000) {
            System.out.println("Sales Commission is 2%");

        }
    }
}

