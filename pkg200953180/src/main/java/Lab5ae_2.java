/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author STUDENT
 */

class Array {
    int[] arr = new int[10];
    
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array(size 10):");
        for (int i = 0; i < 10; i++)
            arr[i] = sc.nextInt();
    }
    
    void display() {
        System.out.println("Array: ");
        for (int i = 0; i < 10; i++)
            System.out.print(" " + arr[i] + " ");
        System.out.println();
    }
    
    void largest() {
        int largest = arr[0];
        for (int i = 1; i < 10; i++)
            if (arr[i] > largest)
                largest = arr[i];
        System.out.println("Largest element of array: " + largest);
    }
    
    void average() {
        int avg = 0;
        for (int i = 0; i < 10; i++)
            avg += arr[i];
        avg /= 10;
        System.out.println("Average of the element of array: " + avg);
    }
    
    void sort() {
        int temp;
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 9; j++)
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        System.out.println("After Sorting");
        display();
    }
}

public class Lab5ae_2 {
    public static void main(String args[]) {
        Array Arr = new Array();
        Arr.input();
        Arr.display();
        Arr.largest();
        Arr.average();
        Arr.sort();
    }
}
