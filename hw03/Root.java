/////
//Yehia Awad
//yea217
//cse2
//This program takes the input and tries to find the cubic root of the number given

import java.util.Scanner; //importing the java utility scanner

public class Root {
    public static void main(String[] args) {
    Scanner myScanner;
     
    myScanner = new Scanner ( System.in ); //assigning the variable
    
    double guess;
    double number;
    double result;
    
    System.out.println("Enter the number "); //asking the user for their input on seconds
    number = myScanner.nextInt(); //initializing the user input into a variable
    
    guess = number/3;
    result = (guess*guess*guess+number)/(3*guess*guess);
    
    System.out.println("The cube root is " + result);
    }
}