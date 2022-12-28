package week7homework;

//Write a java program input sales id, seller's name, sales amount, and salary basic and
//then fined this sales
//Commission
//Sales amount >= 50,000 35%
//Sales amount >= 30,000 20%
//>= 20,000 10%
//>= 10,000 5%
//< 10,000 2%

import java.util.Scanner;

public class Question9_Sales {

    public static void main(String[] args) {
        double commission = 0.0;
        int sales =0;
        int rate =0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sales ID");
        int a = sc.nextInt();
        System.out.println("Sellers name");
        String b = sc.next();
        System.out.println("sales amount");
        int c = sc.nextInt();
        System.out.println("Basic Salary");
        int d = sc.nextInt();

        sales=sc.nextInt();
        if (sales>=50000){

            rate=35;
            commission=sales*0.35;
        } else if (sales>=30000) {

            rate=20;
            commission=sales*0.20;
        } else if (sales>=10000) {

            rate=10;
            commission=sales*0.10;
        } else if (sales>=10000) {

            rate=5;
            commission=sales*0.05;

        } else if (sales<10000) {

            rate=2;
            commission=sales*0.02;

        }
        System.out.println("Commission amount : "+commission);

    }

    }

