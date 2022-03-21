package hw07new;
//Write a Java program to test if an array contains a specific value.
public class Program20 {//class name
    public static void main(String[] args) {//main method

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};////numerical array single dimensional

        System.out.println(contains(num, 11));//print statement
        System.out.println(contains(num, 1));//print statement

    }

    public static boolean contains(int[] arr, int value) {// method

        for (int n : arr) {//for-loop
            if (value == n) {
                return true;//rule
            }
        }
        return false;//rule
    }
}
