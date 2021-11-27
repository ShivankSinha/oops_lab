/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shivank Sinha
 */
import java.util.Scanner;
public class LAB2Q1 {
     public static void main(String[] args) {
         int a,b;
         char ch= 'y';
         Scanner sc=new Scanner(System.in);
         while(ch!='n'){
             System.out.println("Enter a:");
             a=sc.nextInt();
             System.out.println("Enter b:");
             b=sc.nextInt();
             System.out.println((a<<2)+(b>>2));
             System.out.println(((a+b)*100)/10);
             System.out.println(a&b);
             System.out.println("Do you want to continue(y/n)?");
             ch=sc.next().charAt(0);
         
             
             
         }
         
     }


}
