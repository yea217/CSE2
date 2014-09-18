////
//Yehia Awad
//hw03
//CSE 2

import java.util.Scanner; //improving the java utility scanner

public class FourDigits {
        public static void main(String[] args) {
            
            Scanner myScanner; //initializing the Scanner
            myScanner = new Scanner(System.in);
            
    System.out.println("Enter a double and I display the four digits to the right of the decimal point");
    
    double number = myScanner.nextDouble(); //initializing the variable obtained from the input
    int integer = (int)number; //converting the number into an integer
    number = number*10000;
    
    integer = 10000; //castthe integer to a number;
    int printNumber = (int)number - integer;
    double finalNumber = number % integer;
   
    
    System.out.println("The digits are " + (int)finalNumber);
        }
}
    
    