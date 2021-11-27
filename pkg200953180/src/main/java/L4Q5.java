/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static java.lang.Math.sqrt;
import java.util.Scanner;


/**
 *
 * @author student
 */
public class L4Q5 {
    public static void main(String args[]){
    Scanner sn = new Scanner(System.in);
    int i, j, n, trace=0,ss=0, norm;
    int twoD[][] = new int[10][10];
    System.out.println("Enter the dimensions of the array: ");
    n = sn.nextInt();
    
    
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            twoD[i][j] = sn.nextInt();}}
    
    //trace:
    for(i=0;i<n;i++){
        trace = trace + twoD[i][i];}
    
    //norm
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            ss = twoD[i][j]*twoD[i][j];}}
    norm = (int) sqrt(ss);
    System.out.println("The trace of this matrix is: " + trace);
    System.out.println("The norm of this matrix is: " + norm);
}
}