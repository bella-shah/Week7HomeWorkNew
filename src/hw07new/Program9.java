package hw07new;
//Same as above program-8 using switch statement.
import java.util.Scanner;

public class Program9 {//class name

    public static void main(String[] args) {//main method
        char letter;
        Scanner s = new Scanner(System.in);//create object for scanner class
        System.out.println("Enter any alphabet from A to F");//print statement
        letter = s.next().charAt(0);//read the first character

        cities(letter);

    }

    public static void cities(char letter) {//static method

        switch (letter) {//switch statement

            case 'A':
                System.out.println("Atlanta");//print statement
                break;
            case 'B':
                System.out.println("Baroda");
                break;
            case 'C':
                System.out.println("Chicago");
                break;
            case 'D':
                System.out.println("Durham");
                break;
            case 'E':
                System.out.println("Edinburgh");
                break;
            case 'F':
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }

}
