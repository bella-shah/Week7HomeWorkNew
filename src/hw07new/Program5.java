package hw07new;
//WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary

import java.util.Scanner;

public class Program5 {//class name

    public static void main(String[] args) {//main method

        int empId;//instance variable
        double salary;//instance variable
        String empName;//instance variable

        Scanner scan = new Scanner(System.in);//created object for scanner class
        System.out.println("Enter employee ID: ");//print statement
        empId = scan.nextInt();//read user input
        System.out.println("Enter Employee name: ");//print statement
        empName = scan.next();//read user input
        System.out.println("Enter your basic salary: ");//print statement
        salary = scan.nextDouble();//read user input

        double hra = 0.1 * salary;//converted percentages to  it's multiplier
        double da = 0.08 * salary;//converted percentages to  it's multiplier
        double ta = 0.09 * salary;//converted percentages to  it's multiplier
        double pf = 0.2 * salary;//converted percentages to  it's multiplier
        double gross = salary + hra + da + ta - pf;//sum

        System.out.println("_______________________________");//print statement
        System.out.println("|        Salary Slip           |");//print statement
        System.out.println("|______________________________|");//print statement
        System.out.println("| Employee Id : " + empId + "           |");//print statement
        System.out.println("| Employee Name : " + empName + "          |");//print statement
        System.out.println("|______________________________|");//print statement
        System.out.println("|| Basic Salary : " + salary + "      |");//print statement
        System.out.println("| HRA 10% : " + hra + "             |");//print statement
        System.out.println("| TA 8% :  " + ta + "              |");//print statement
        System.out.println("| DA 9% :  " + da + "              |");//print statement
        System.out.println("| PF -20& :  " + pf + "            |");//print statement
        System.out.println("|______________________________|");//print statement
        System.out.println("| Gross Salary : " + gross + "       |");//print statement
        System.out.println("|==============================|");//print statement


    }
}


