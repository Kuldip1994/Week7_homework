package week7homework;

import java.util.Scanner;

public class Question5_Marksheet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maths, science, english;
        System.out.println("Enter Student Name");
        String a = sc.next();
        System.out.println("Enter Student Roll no");
        int b = sc.nextInt();
        System.out.println("Maths Marks");
        maths = sc.nextInt();
        System.out.println("Science Marks");
        science = sc.nextInt();
        System.out.println("English Marks");
        english = sc.nextInt();


        float sum = maths + science + english;
        System.out.println("The sum of the total marks of all subjects : " + sum);
        int total = 300;
        System.out.println("Total Marks : " + total);
        float per = sum / total * 100;
        System.out.println("Total percentage  :" + per);



        if (per >= 80) {
            System.out.println("Grade A+");
        } else if (per >= 60) {
            System.out.println("Grade A ");
        } else if (per >= 50) {
            System.out.println("Grade B");
        } else if (per >= 35) {
            System.out.println("Grade C");

        } else if (per < 34) {
            System.out.println("Fail");
        } else{
    }

            System.out.println("-------------------------------------------------------------------------");
            System.out.println("|                                                                        |");
            System.out.println("|                            Mark Sheet                                  |");
            System.out.println("|______                                                                  |");
            System.out.println("|        Name                                    : " + a + "                 |");
            System.out.println("|        Roll No                                 : " + b + "                 |");
            System.out.println("|________________________________________________________________________|");
            System.out.println("|        Subject                                 : Marks                 |");
            System.out.println("|________________________________________________________________________|");
            System.out.println("|        Maths                                   :" + maths + "              |");
            System.out.println("|        Science                                 :" + science + "            |");
            System.out.println("|        English                                 :" + english + "            |");
            System.out.println("|________________________________________________________________________|");
            System.out.println("|        Total                                   :" + total + "              |");
            System.out.println("|________________________________________________________________________|");
            System.out.println("|        Percentage                              :" + per + "                |");
            System.out.println("|        Result                                  :   +result             |");
            System.out.println("|        Grade                                   : +grade+              |");
            System.out.println("|________________________________________________________________________|");

        }


    }
