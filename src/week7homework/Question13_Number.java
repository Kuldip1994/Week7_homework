package week7homework;
//Write a java program to print the numbers between 1 to 100 which can be divided by 3
//and 5 separately.
public class Question13_Number {

    public static void main(String[] args) { //main method
        for(int i = 1; i <= 100; i++){ //declare variable
            if (i % 3 ==0){
                System.out.println(i);

            }
        }

        for (int i =1; i <=100; i++){
            if(i % 5 ==0){
                System.out.println(i);
            }
        }


    }

}
