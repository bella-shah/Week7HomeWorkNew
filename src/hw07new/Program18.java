package hw07new;

//Write a Java program to sum values of an array.
public class Program18 {//class name

    public static void main(String[] args) {//main method
        int[] num = {1, 17, 32, 20, 45};//numerical array single dimensional
        int sum = 0;//instance variable
        for (int i : num) {//for-loop
            sum += i;//sum/addition formula
        }
        System.out.println("The Sum of array is : " + sum);//print statement

    }
}

