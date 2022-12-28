package week7homework;
//Write a Java program to sort a numeric array and a string array.

public class Question20_SumValue {

    public static void main(String[] args) {

        int array [] = {4,5,8,7,7,8};
        int sum = 0;

        for (int i=0; i<=array.length-1;i++)
            sum=sum+array[i];

        System.out.println("The sum is  "+sum);

    }
}
