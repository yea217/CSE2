//Yehia Awad
//yea217
//CSE2
//lab05


import java.util.Scanner;//import the utility scanner

public class RandomGames {
    public static void main(String[] args){
        
        Scanner myScanner;
        myScanner = new Scanner ( System.in ); //assigning a variable
        
    System.out.println("Enter R or r for Roulette, C or c for craps, P or p for pick a card");
    String input = myScanner.next();//obtaining the input and making it a variable
    char answer = input.charAt(0);
    int roulette = (int)(Math.random()*37);
    int craps = (int)(Math.random()*7);
    int craps1 = (int)(Math.random()*7);
    int result = (int)(craps1 + craps);
   
    if (input.length() == 1){
        switch (answer){
    
            case 'R': case 'r':
                System.out.println("Roulette: " + roulette);
                break;   
            case 'C': case 'c':
                System.out.println("Craps: " + craps + "+" + craps1 + "=" + result);
                break;
            case 'P': case 'p':
                System.out.println("This has not been implemented");
                break;
            
            
            default: 
                System.out.println("Your answer is not one of 'R', 'r', 'C', 'c', 'P', or 'p' ");
                break;
    }//end of switch
    }//end of if statement
            else {
                System.out.println("This is not a one character string");
            }//end of else
    }//end of main    
}//end of class