/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.util.Scanner;
/**
 *
 * @author Ariel
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // By Ariel Wazana
    //Creating Scanner
    Scanner myInput = new Scanner(System.in);
    //Asking Question
    System.out.printf("Please enter the inital balance: ");
    double initalBal = myInput.nextDouble();
    System.out.printf("Please enter the annual interest rate (2 for 2%%): ");
    double annualRate = myInput.nextDouble();
    System.out.printf("Please enter the number of years the client wants to save the money in the bank: ");
    double yearsInBank = myInput.nextDouble();
    // Calculations
    double finalBal = initalBal * Math.pow(1 + annualRate / 100, yearsInBank);
    //Outputting Final Outputs
    System.out.println( "\n------------------------------------------------------");
    System.out.printf("Inital Balance         : " + initalBal );
    System.out.printf("\nAnnual Interest Rate   : " + annualRate );
    System.out.printf("\nSaving Years           : " + yearsInBank );
    System.out.println( "\n------------------------------------------------------");
    System.out.printf("Balance after 5 years  : " + finalBal );
    System.out.println( "\n------------------------------------------------------");    
    System.out.printf("\n");
    //Programming done by Ariel Wazana 
    }
    
}
