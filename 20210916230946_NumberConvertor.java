/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.util.Scanner;
/**
 *
 * @author Ariel
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // By Ariel jacob Wazana
    //Creating Scanner    
    Scanner myInput = new Scanner(System.in); 
    //Printing Question
    System.out.println( "------------------------------------------------------");
    System.out.printf("Please enter a 4-digits Octal number: ");
    System.out.println( "\n------------------------------------------------------");
    System.out.printf("\n");
    //Declaring Integers
    int calc = 0;
    int decimalNum = 0 ;
    int octalInput = myInput.nextInt();
    int octalNum = octalInput ;
    //Actual calculation process 
    while (true){
        if (octalInput==0)
        {break;}
        else 
            {int Fdecimal = octalInput%10;
            decimalNum +=Fdecimal*Math.pow(8, calc);
            octalInput = octalInput/10;
            calc++;}    
    }
    //Printing out final responses
    System.out.println( "\n------------------------------------------------------");
    System.out.printf("Octal Number : " + octalNum);
    System.out.println( "\n------------------------------------------------------");
    System.out.printf("Decimal Number : " + decimalNum);
    System.out.println( "\n------------------------------------------------------");
    System.out.printf("\n");
    
    }
    
}
