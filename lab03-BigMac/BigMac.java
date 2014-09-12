///////////////
//Yehia Awad
//CSE2
//lab03
//yea217
//This program is supposed to help you computing the cost in buying a big mac.

import java.util.Scanner; //importing the java utility scanner

public class BigMac {
        public static void main(String[] args) {
         
         Scanner myScanner;
         
         myScanner = new Scanner ( System.in ); //assigning the variable
         
    System.out.print("Enter the number of big Macs {an integer > 0}: "); //asking the user for their input
    int nBigMac = myScanner.nextInt(); //initializing the user input into a variable
    
    System.out.print("Enter the cost per Big Mac as" + "a double (in the form xx.xx) : ");
    double bigMac$ = myScanner.nextDouble(); //obtaining the information into a variable
    
    System.out.print("Enter the percent tax as a whole number (xx): ");
    double taxRate = myScanner.nextDouble();
    taxRate/=100;
    
    double cost$;
    int dollars;
    int dimes;
    int pennies;
    
    cost$ = nBigMac*bigMac$*(1+taxRate); //whole amount with decimal
    dollars = (int)cost$; //truncating the decimal for the whole dollar amount
    dimes = (int)(cost$*10)%10;
    pennies = (int)(cost$*100)%10;
    
    System.out.println("The total cost of " + nBigMac +" BigMacs, at $"+bigMac$ +" per bigMac, with a" + " sales tax of "+ (int)(taxRate*100) + "%, is $" +dollars+'.'+dimes+pennies);
         
            
            
            
            
            
        } //end of main method
} //end of class
