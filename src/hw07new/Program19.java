package hw07new;

//Write a Java program to calculate the average value of array elements.
public class Program19 {//class name

    public static void main(String[] args) {//main method

        int[] num = new int[]{7, 2, 12, 24, 25, 16, 17, 8, 19, 10};//numerical array single dimensional

        //calculate sum
        int sum = 0;//instance variable
        for (int i = 0; i < num.length; i++) {//for-loop
            sum = sum + num[i];
        }
        //calculate average
        double avg = sum / num.length;//mean/avg formula
        System.out.println("The average of the array value is: " + avg);// print statement

    }
}

