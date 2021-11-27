/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shivank Sinha
 */
import java.util.Scanner;
public class LAB2Q2 {
    public static void main( String args[]){
        int a,b,c,min,max;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        a=sc.nextInt();
        System.out.println("Enter b:");
        b=sc.nextInt();
        System.out.println("Enter c:");
        c=sc.nextInt();
        max=(a>b)?(a>c?a:c):(b>c?b:c);
        min=c<(a<b?a:b)?c:(a<b?a:b);
        System.out.println("Max:"+ max);
        System.out.println("Min:"+ min);
        
          
             
    }
}
