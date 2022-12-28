package week7homework;
//Write a java program that tells us that Input number is odd or even?
//HINT: use ternary operator (? :)

public class Question1_Ternary {
    public static void main(String [] args) {  //main method

        int number = 4; //local variable

        String m = (number % 2 ==0) ? "This number is even"  : "This number is odd";
        System.out.println(m); //print method



    }


}
