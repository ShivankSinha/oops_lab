/*
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
public class L4Q3 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int n,i,a,count=0;
        int arr[] = new int[50];
        System.out.println("Enter the number of elements of the array: ");
        n = sn.nextInt();
        System.out.println("Enter the elements: ");
        for(i=0;i<n;i++)
        {
            arr[i] = sn.nextInt();
        }
        
        System.out.println("Enter the element to be searched: ");
        a = sn.nextInt();
        
        for(i=0;i<n;i++)
        {if(arr[i]==a)
            count = count+1;}
        
        if(count==0)
            System.out.println("The element is not present in the array");
        
        else
            System.out.println("The element is present " + count + " times in the array");
        
    
}}
