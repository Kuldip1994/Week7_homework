package week7homework;

//Same as above program-8 using switch statement.

public class Question11_Switch {

    public static void main(String [] args){
        String Alapabet = "B"; //declare variable

        switch (Alapabet){  //switch statement
            case "A":
                System.out.println("Athens");
                break;
            case "B":
                System.out.println("Bristol");
                break;
            case "C":
                System.out.println("Cardiff");
                break;
            case "D":
                System.out.println("Durham");
                break;
            case "E":
                System.out.println("Exeter");
                break;
            case "F":
                System.out.println("Fulham");
                break;
            default:
                System.out.println("Invalid Input");
        }


    }


}
