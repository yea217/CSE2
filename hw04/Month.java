//Yehia Awad
//yea217
//CSE2
//HW04
//This program provides the range for the months of the year

import java.util.Scanner; //importing Java's utility Scanner

public class Month {
        public static void main(String[] args) {
         
        Scanner myScanner;
        myScanner = new Scanner ( System.in ); //assigning the variable
         
    System.out.println("Enter an int giving the number of month (1-12) "); //asking the user for their input
    int answer = myScanner.nextInt(); //initializing the user input into a variable
         
        if (answer == 1 || answer == 3 || answer == 5 || answer == 7 || answer == 8 || answer == 10 || answer == 12){
            System.out.println("The month has 31 days");
            }//end of first if statement
        
        else if (answer > 12){
            System.out.println("You did not enter an int between 1 and 12");
            }//end of second if statement
            
        else if (answer == 2){
            System.out.println("Enter an int giving the year");
            int year = myScanner.nextInt();
            
                if (year %4 == 0 && year%400 == 0){
                    System.out.println("This month has 29 days");
                }//end of nested if statement
                else{
                    System.out.println("This month has 28 days");
                }//end of nested else statement
            }//end of third if statement
        
        else {
            System.out.println("This month has 30 days");
        }//end of last if statement
        
        }//end of string
}//end of class