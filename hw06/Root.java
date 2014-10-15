//Yehia Awad
//yea217
//hw06
//This program tries to get the square root of a program

import java.util.Scanner;

public class Root{
    public static void main(String[] args){
        
        Scanner myScanner;
        
        myScanner = new Scanner(System.in);
        
    System.out.println("Enter an double greater than 0");
    int x = myScanner.nextInt();
    
    double low = 0;
    double high = x + 1;
    double middle = (high+low)/2;
    boolean check = (high-low) > (0.0000001 * high);
    
    while(check == true){
        if((middle*middle) > x){
            middle = middle;
            high = middle;
        }//end of true if statement
        
        else if((middle*middle) < x){
            middle = low;
            middle = middle;
        }//end of false if statement
        check = (high-low) > (0.0000001 * high);
    }//end of while loop
        System.out.println(middle);
    }
}