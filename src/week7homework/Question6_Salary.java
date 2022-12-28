package week7homework;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Question6_Salary {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Id");
        String a =sc.next();
        System.out.println("Enter Employee Name");
        String b =sc.next();
        System.out.println("Enter Basic Salary");
        int basic =sc.nextInt();
        double HRA=basic*10/100;
        double DA=basic*8/100;
        double TA=basic*9/100;
        double PF=basic*20/100;
        double Grosssalay = basic+HRA+DA+TA-PF;

        System.out.println( "-------------------------------------------------");
        System.out.println( "|              Salary Slip                      |");
        System.out.println( "|_______________________________________________|");
        System.out.println( "|Employee ID                     :"+a+"            |");
        System.out.println( "|Employee Name                   :"+b+"            |");
        System.out.println( "|_______________________________________________|");
        System.out.println( "|Basic Salary                    :"+basic+"          |");
        System.out.println( "|HRA 10%                         :"+HRA+"         |");
        System.out.println( "|TA 8%                           :"+DA+"         |");
        System.out.println( "|DA 9%                           :"+TA+"         |");
        System.out.println( "|PF -20&                         :"+PF+"         |");
        System.out.println( "|_______________________________________________|");
        System.out.println( "|Gross Salary                    :"+Grosssalay+"        |");
        System.out.println( "|===============================================|");









    }

}
