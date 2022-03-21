package hw07new;
//Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class Program17 {//class name

    public static void main(String[] args) {//main method
//alphabetical order      //smallest--->biggest number order
        int[] num = {128, 55, 3, 76, 6, 49877, 45, 2};//array - single dimensional syntax NUMERIC ARRAY

        String[] word = {"Jail", "Dog", "Tiger", "Banana", "Salt"};//string array

        System.out.println("Original numeric array: " + Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("Sorted numeric array: " + Arrays.toString(num));

        System.out.println("Original string array: " + Arrays.toString(word));
        Arrays.sort(word);
        System.out.println("Sorted string array: " + Arrays.toString(word));
    }
}

