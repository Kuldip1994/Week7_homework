package week7homework;

//Write a program that tells us input value is number or an alphabet or symbol.

import java.util.Scanner;

public class Question14_InputValueNumber {  //main method
    public static void main(String [] args) {
        Scanner sc= new Scanner(System.in);  //declare
        System.out.println("Enter value is number or alphabet or symbol  :");
        char a =sc.next().charAt(0);
        if((a >= 'a'  && a<='z') || (a>= 'A'  && a<= 'Z')) {
            System.out.println("Is a Alphabet");
        } else if (a>=  '0' && a<='9') {
            System.out.println("Is a Number");
        }else {
            System.out.println("Is a Symbol");

        }


    }
}
