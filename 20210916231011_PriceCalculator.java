/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.util.Scanner;
/**
 *
 * @author Ariel Wazana
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Creating Scanner
    Scanner myInput = new Scanner(System.in);
    //Making variables and questions
    System.out.printf("Please enter the item price: ");
    double itmPrice = myInput.nextDouble();
    System.out.printf("Please enter the discount ratio (5 for 5%%): ");
    double disRatio = myInput.nextDouble();
    //Declaring Variables
    double a = 100 ;
    //Formula
    double disFormula = ((disRatio/a)*itmPrice);
    double disPrice = (itmPrice-disFormula );
    double fedTax = (disFormula*0.05);
    double provTax = (disFormula + fedTax);
    double provvTax = (provTax*0.09975);
    double finalPrice = (disPrice + fedTax + provvTax);
    
    //Outputting response
    System.out.println( "\n------------------------------------------------------");
    System.out.printf("\nOriginal Price   : " + itmPrice );
    System.out.printf("\nDiscount Ratio   : " + disRatio );
    System.out.printf("\nMoneySaved : " + disFormula );
    System.out.printf("\nDiscounted price before Tax : " + disPrice );
    System.out.printf("\n");
    System.out.println( "\n------------------------------------------------------");
    System.out.printf("\nFederal Tax: " + fedTax );
    System.out.printf("\nProvincial Tax: " + provvTax );
    System.out.printf("\nFinal Price: " + finalPrice );
    System.out.printf("\n");
    System.out.printf("\n");
    System.out.println( "------------------------------------------------------");
    System.out.println( "Thanks for using Ariel Wazana's TAX PRICE convertor!");
    System.out.println( "------------------------------------------------------"); 
    }

}
