/*
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
public class Lab5ae_3 {
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swap");
        System.out.println("a: " + a + "  b: " + b);
    }
    
    //static void swap()
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter a:");
        a = sc.nextInt();
        System.out.println("Enter b");
        b = sc.nextInt();
        System.out.println("a: " + a + "  b: " + b);
        swap(a, b);
        System.out.println("a: " + a + "  b: " + b);
    }
}
