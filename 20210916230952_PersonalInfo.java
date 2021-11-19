// All Rights Reserved.
 
package javaapplication1;
import java.util.Scanner;
//Imported Scanner
public class JavaApplication1 {

    public static void main(String[] args) {
        // by Ariel Wazana
//Creating Scanner
Scanner myInput = new Scanner(System.in);
//Making Strings and Questions
System.out.printf ("Please enter your name: ");
String name = myInput.nextLine();
System.out.printf ("Please enter your age: ");
String age = myInput.nextLine();
System.out.printf ("Please enter your gender: ");
String gender = myInput.nextLine();
System.out.printf ("Please enter your department: ");
String department = myInput.nextLine();
System.out.printf ("Please the value of PI(3.1415926): ");
String PI = myInput.nextLine();
//Outputting the response
System.out.printf("\n");
System.out.printf("\nName               : " + "%1s", name);
System.out.printf("\nAge                : " + "%1s", age);
System.out.printf("\nGender             : " + "%1s", gender);
System.out.printf("\nDepartment         : " + "%1s", department);
System.out.printf("\nPI                 : " + "%1s", PI);
System.out.printf("\n");
//Original Code down below but couldnt get the ":" to go infront of the strings
//System.out.printf("\nAge %20s: ",age);
//System.out.printf("\nGender %20s: ",gender);
//System.out.printf("\nDepartment %20s: ",department);
//System.out.printf("\nPI %20s: ",PI);
    }
    
}
//Done, by Ariel Wazana