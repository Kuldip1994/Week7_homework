package week7homework;
//Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class Question19_SortArray {
    public static void main(String [] args){

        int[] Array = {
                101,104,102,103,104,100,
                200,301,304,206,208,308,
                201,202,205,302,304,305};

        String [] String = {"House", "Flat", "Bunglow", "Pent House", "Mansion"};

        System.out.println("Numeric Array   : "+ Arrays.toString(Array));
        Arrays.sort(Array);
        System.out.println("Sorted Numeric Array   :"+Arrays.toString(Array));
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("String array   :"+Arrays.toString(String));
        Arrays.sort(String);
        System.out.println("Sorted String array   :"+Arrays.toString(String));
    }

}
