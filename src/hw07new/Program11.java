package hw07new;

//Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.
public class Program11 {
    public static void main(String[] args) {//main method

        System.out.println("\nDivided by 3: ");//print statement
        for (int i = 1; i < 100; i++) {//for loop
            if (i % 3 == 0)//if condition
                System.out.print(i + ", ");//leaves space between each number
        }

        System.out.println("\nDivided by 5: ");//print statement
        for (int i = 1; i < 100; i++) {//for loop
            if (i % 5 == 0) System.out.print(i + ", ");//if condition
        }
    }
}
