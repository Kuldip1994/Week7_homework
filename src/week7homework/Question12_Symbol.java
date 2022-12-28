package week7homework;

//Write a java program to input any two number and ask user to enter their symbol (+, -,
///, *) find addition, Subtraction, multiplication and division according to their symbol
//(using if else)

import java.util.Scanner;

public class Question12_Symbol {

    public static void main(String [] args) {  //main method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value  :");  //user to input any number
        int a = sc.nextInt();
        System.out.println("Enter Value   :");  // user to input any number
        int b = sc.nextInt();
        System.out.println("Enter any symbol (+,-,/, *)"); //enter symbol
        char symbol = sc.next().charAt(0);

        if (symbol== '+'){
            System.out.println("Addition  :"   +(a+b));
        } else if (symbol == '-') {
            System.out.println("Subtraction is :  " + (a - b));
        } else if (symbol == '/') {
            System.out.println("Division is  :" + (a / b));
        } else if (symbol == '*') {
            System.out.println("Multiplication is : " + (a * b));
        }else {
            System.out.println("invalid Entry");

        }

    }


    }





