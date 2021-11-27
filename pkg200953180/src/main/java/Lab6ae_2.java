/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author STUDENT
 */
import java.util.Scanner;
class Bike {
    int speedlimit;
    Bike(int a) {
        speedlimit = a;
    }
    void run() {
        System.out.println(speedlimit);
    }
}

class Splendor extends Bike {
    int speedlimit;
    Splendor(int a, int b) {
        super(a);
        speedlimit = b;
    }
    void run() {
        System.out.println(speedlimit);
    }
}

public class Lab6ae_2 {
    public static void main(String[] args){
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the speed limits of bike class");
        a=sc.nextInt();
        System.out.println("Enter the speed limit of splendor class");
        b=sc.nextInt();
        Bike bike =new Bike(a);
        Bike spl= new Splendor(a,b);
        bike.run();
        spl.run();
        System.out.println(bike.speedlimit);
        System.out.println(spl.speedlimit);
    }
}
