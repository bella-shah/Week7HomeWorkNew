package hw07new;

//Write a java program to input student Name, roll No, and three subjects Math, Science...


import java.util.Scanner;

public class Program3 {//class name
    public static void main(String[] args) {//main method
        int Rollnumber, Maths, Science, English, Total;
        int marks;//instance variable
        double avg;//instance variable
        String name, result = null, grade = null;//string method

        Scanner s = new Scanner(System.in);//created object for scanner

        System.out.println("Enter Student Name:");//print statement
        name = s.next();//read user input
        System.out.println("Enter Student roll number:");//print statement
        Rollnumber = s.nextInt();//read user input
        System.out.println("Maths marks: ");//print statement
        Maths = s.nextInt();//read user input
        while (Maths < 0 && Maths > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100\"");//print statement
        }

        System.out.println("Science marks: ");//print statement
        Science = s.nextInt();
        while (Science < 0 && Science > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100\"");//print statement
        }

        System.out.println("English marks: ");//print statement
        English = s.nextInt();
        while (English < 0 && English > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100\"");//print statement
        }

        double total = Maths + Science + English;
        avg = total / 3;


        if (avg >= 35) {//if-else condition
            result = "Pass";
        } else if (avg >= 80) {
            grade = "Garde A+";
        } else if (avg >= 60) {
            grade = "Grade A";
        } else if (avg >= 50) {
            grade = "Grade B";
        } else if (avg >= 35) {
            grade = "Grade C";
        } else {
            result = "Fail";
        }
        System.out.println("|-----------------------------------------|");//print statement
        System.out.println("|         Mark Sheet                      |");//print statement
        System.out.println("|-----------------------------------------|");//print statement
        System.out.println("|    Name      :       " + name + "|");//print statement
        System.out.println("|    Roll No.  :       " + Rollnumber + "|");//print statement
        System.out.println("|-----------------------------------------|");//print statement
        System.out.println("|    Subject   :        Marks             |");//print statement
        System.out.println("|    Maths     :        " + Maths + "|");//print statement
        System.out.println("|    Science   :        " + Science + "|");//print statement
        System.out.println("|    English   :        " + English + "|");//print statement
        System.out.println("|-----------------------------------------|");//print statement
        System.out.println("|    Total     :        " + total + "|");//print statement
        System.out.println("|-----------------------------------------|");//print statement
        System.out.println("|    Percentage:        " + avg + "|");//print statement
        System.out.println("|    Result    :        " + result + "|");//print statement
        System.out.println("|    Grade     :        " + grade + "|");//print statement
        System.out.println("|-----------------------------------------|");//print statement

    }
}