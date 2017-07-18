/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplifying.fractions;

/**
 *
 * @author Roby
 */
import java.util.Scanner;
public class SimplifyingFractions {

    public static long hcm(long divisor, long dividend){
        int divRemainder = (int) (divisor%dividend);
        if (divRemainder == 0) {
            return dividend;
        }
        
        return hcm(dividend, divRemainder);
    }

    
    /* So, we want the lcd. Theres an algorithm for that which we will borrow from math */
    /* This is Euclid's algorithm but we won't explain it cuz fuck it. Turns out I don't know why it works or how people thought of it. Whatever. /*
    
    */
    /**
     * @param args the command line arguments
     */
    //For euclids algorithm we need to find out the highest number of the two

    public static void main(String[] args) {
        
        Scanner scanUser = new Scanner(System.in);
        long numerator = scanUser.nextLong();
        long denominator = scanUser.nextLong();

            if (numerator > denominator){
                long gcm = hcm(numerator, denominator);
                long reducedNum = numerator/gcm;
                long reducedDen = denominator/gcm;
                
                String dashTotal = new String();
                String boogers = "" + reducedDen;
                for (int x = 0; x < boogers.length(); x++){
                
                    dashTotal = dashTotal + "-";
                }
                System.out.println(reducedNum);
                System.out.println(dashTotal);
                System.out.println(reducedDen);
                
                
                
            }
            else if (numerator < denominator) {
                long gcm = hcm(denominator, numerator);
                long reducedNum = numerator/gcm;
                long reducedDen = denominator/gcm;
                
                String boogers = "" + reducedNum;
                
                String dashTotal = new String();
                System.out.println(boogers.length());
                for (int x = 0; x < boogers.length(); x++){
                
                    dashTotal = dashTotal + "-";
                }
                System.out.println(reducedNum);
                System.out.println(dashTotal);
                System.out.println(reducedDen); 
            }
        // TODO code application logic here
    }
    
}
