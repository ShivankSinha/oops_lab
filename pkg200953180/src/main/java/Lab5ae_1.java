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

class Result {
    int[] roll_no = new int[3];
    int[][] marks = new int[3][3];
    
    void store_2d() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i ++) {
            System.out.println("Enter Roll No.:");
            roll_no[i] = sc.nextInt();
            store_1d(marks[i]);
        }
    }
    
    void store_1d(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Marks in Subject " + (i+1) + ":");
            arr[i] = sc.nextInt();
        }
    }
    
    void highest_subject() {
        int highest, idx;
        for (int j = 0; j < 3; j++) {
            highest = marks[0][j];
            idx = 0;
            for (int i = 1; i < 3; i++) {
                if (marks[i][j] > highest) {
                    highest = marks[i][j];
                    idx = i;
                }
            }
            System.out.println("Highest Marks for Subject " + (j+1) + ":");
            System.out.println("Roll No.: " + roll_no[idx]);
            System.out.println("Marks: " + marks[idx][j]);
        }
    }
    
    void highest_total() {
        int[] total = new int[3];
        int i, j;
        for (i = 0; i < 3; i++){
            total[i] = 0;
            for(j = 0; j < 3; j++)
                total[i] += marks[i][j];
        }
        int highest = total[0];
        int idx = 0;
        for (i = 1; i < 3; i++)
            if (total[i] > highest) {
                highest = total[i];
                idx = i;
            }
        System.out.println("Student with highest total marks: ");
        System.out.println("Roll No.: " + roll_no[idx]);
        System.out.println("Total Marks: " + total[idx]);
    }
}

public class Lab5ae_1 {
    public static void main(String args[]) {
        Result res = new Result();
        
        res.store_2d();
        res.highest_subject();
        res.highest_total();
    }
}
