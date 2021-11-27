/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shivank Sinha
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author student
 */
public class L4Q2 {
     public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int n,i,max,min;
        int arr[] = new int[50];
        System.out.println("Enter the number of elements of the array: ");
        n = sn.nextInt();
        System.out.println("Enter the elements: ");
        for(i=0;i<n;i++)
        {
            arr[i] = sn.nextInt();
        }
        
        max = arr[0];
        min = arr[0];
        for(i=1;i<n;i++){
            if(arr[i]>max)
                max = arr[i];
            else if(arr[i]<min)
                min = arr[i];
        }
        
        System.out.println("The largest number is: " + max);
        System.out.println("The smallest number is: " + min);
}
}
