package week7homework;

import java.util.Scanner;

//Write a java program to input any number and find out if it’s odd or even
public class Question7_OddEven {

    public static void main (String [] args) {//main method
        Scanner sc = new Scanner(System.in);  // scanner to allow user to input
        System.out.println("Enter Any Number"); //print
        int a = sc.nextInt(); //reading number from user
        if (a % 2==0){
        System.out.println("Enter number is even"); }
        else {
            System.out.println("Enter number is odd");}



    }

}
