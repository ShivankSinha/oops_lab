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
public class Lab5ae_5 {
    static float square (float num) {
        return (num*num);
    }
    public static void main(String args[]) {
        float num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        num = sc.nextFloat();
        System.out.println("square(" + num + ") = " + square(num));
    }
}
