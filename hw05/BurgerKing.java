//Yehia Awad
//CSE2
//yea217
//hw05
//This Burger King program will ask the user for their choice in food and recipricate a response based on their input.

import java.util.Scanner;//import the utility scanner

public class BurgerKing {
    public static void main(String[] args){
        
        Scanner myScanner;
        myScanner = new Scanner ( System.in ); //assigning a variable
        
        System.out.println("Enter a letter to indicate the choice of \nBurger (B or b) \nSoda (S or s) \nFries (F or f)");//asking the user for their input
        String input = myScanner.next();//initializing the user input into a variable
        char answer = input.charAt(0);
   
    if (input.length() == 1){
        switch(answer){
        case 'B': case 'b':
            System.out.println("Enter A or a for all the fixins \nC or c for cheese \nN or n for none of the above");
            String input1 = myScanner.next();
            char toppings = input1.charAt(0);
            
            switch(toppings){
                case 'A': case 'a':
                System.out.println("You ordered a burger with all the fixins");
                break;
                
                case 'C': case 'c':
                System.out.println("You ordered a burger with cheese");
                break;
                
                case 'N': case 'n':
                System.out.println("You ordered a burger with nothing on it");
                break;
            }//Switch B burger
         break;       
        
        case 'S': case 's':
            System.out.println("Do you want a Pepsi (P or p) \nCoke (c or C), \nSprite (s or S) or \nMountain Dew (M or m)");
            String input2 = myScanner.next();
            char drink = input2.charAt(0);
            
            switch(drink){
                case 'P': case 'p':
                System.out.println("You ordered Pepsi");
                break;
                
                case 'C': case 'c':
                System.out.println("You ordered coke");
                break;
                
                case 'S': case 's':
                System.out.println("You ordered Sprite");
                break;
                
                case 'M': case 'm':
                System.out.println("You ordered Pepsi");
                break;
            }//end of switch soda
         break;
        
        case 'F': case 'f':
            System.out.println("Do you want a large or small order? (l,L, s,S)?");
            String input3 = myScanner.next();
            char fries = input3.charAt(0);
        
            switch(fries){
                 case 'L': case 'l':
                System.out.println("You ordered large fries");
                break;
                
                 case 'S': case 's':
                System.out.println("You ordered small fries");
                break;
            }//end of fries switch statement
        break;
        
        default : {
            System.out.println("You did not enter any of B, b, S, s, F, or f");
        }//end of default
        
        }//end of main switch
    }//end of if
    
    else {
            System.out.println("a single character expected");
    }//end of else
    } //end of main
}//end of class