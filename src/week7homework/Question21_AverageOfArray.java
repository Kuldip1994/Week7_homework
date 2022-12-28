package week7homework;

//Write a Java program to sum values of an array.
public class Question21_AverageOfArray {

    public static void main(String[] args) {
        double array[] = {45, 43, 78, 81, 96, 12};
        int i, sum, avg;
        sum = 0;
        for (i = 0; i < array.length; i++) {
            sum += array[i];
        }
        avg = sum / array.length;
        System.out.println("The average is   :" + avg);
    }
}
