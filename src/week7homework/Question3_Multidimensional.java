package week7homework;
//Declare multidimensional array and store 5 countries and their
//capital and print them in console.
public class Question3_Multidimensional {

    public static void main(String [] args) {  //Main Method
        String [] [] country = {{"India"},{"America"}, {"Japan"}, {"China"}, {"Germany"}};  //local veriable
        String [] [] captial = {{"Delhi"}, {"Washinton"}, {"Tokyo"}, {"Beijing"}, {"Berling"}}; // local variable
        String [] [] strArray = new String[5][2]; // 5 rows and 2//columns

        System.out.println("The Country is  :"+country [0] [0]   +  "  and " + "The captial  is  :"+captial [0][0]);   //Print statement
        System.out.println("The Country is  :"+country [1] [0]   +  "  and " + "The captial  is  :"+captial [1][0]);
        System.out.println("The Country is  :"+country [2] [0]   +  "  and " + "The captial  is  :"+captial [2][0]);
        System.out.println("The Country is  :"+country [3] [0]   +  "  and " + "The captial  is  :"+captial [3][0]);
        System.out.println("The Country is  :"+country [4] [0]   +  "  and " + "The captial  is  :"+captial [4][0]);













    }


}
