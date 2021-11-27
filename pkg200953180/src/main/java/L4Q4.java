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
public class L4Q4 {
public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int n1, n2, i, j, n3;
        int arr1[] = new int[50];
        int arr2[] = new int[50];
        int arr3[] = new int[50];
        System.out.println("Enter the number of elements of the first array: ");
        n1 = sn.nextInt();
        System.out.println("Enter the elements: ");
        for(i=0;i<n1;i++)
        {
            arr1[i] = sn.nextInt();
        }
        
        
        System.out.println("Enter the number of elements of the second array: ");
        n2 = sn.nextInt();
        System.out.println("Enter the elements: ");
        for(i=0;i<n2;i++)
        {
            arr2[i] = sn.nextInt();
        }
        
        n3 = n1+n2;
        
        for(i=0;i<n1;i++){
            arr3[i] = arr1[i];}
        
        for(j=0;j<n2;j++)
        {arr3[i+j] = arr2[j];}
        
        System.out.println("The elements of the merged array are: ");
        for(i=0;i<n3;i++)
        {System.out.println(arr3[i]);}
       
        
}}
