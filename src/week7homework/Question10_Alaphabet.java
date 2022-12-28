package week7homework;

import java.util.Scanner;

//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry
public class Question10_Alaphabet {
    public static void main(String []args) {  //main method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alaphet from A to F");
        String city =sc.nextLine();

        if(city.equals("A")){
            System.out.println("Athens");
        } else if (city.equals("B")) {
            System.out.println("Bristol");
        }else if (city.equals("C")){
            System.out.println("Cardiff");
        } else if (city.equals("D")) {
            System.out.println("Durham");
        } else if (city.equals("E")) {
            System.out.println("Exeter");
        } else if (city.equals("F")) {
            System.out.println("Fulham");
        }else{
            System.out.println("Invalid Entry");

    }
            }


    }

