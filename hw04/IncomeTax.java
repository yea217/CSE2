//Yehia Awad
//yea217
//CSE2
//HW04
//This program provides the income tax based on the income provided

import java.util.Scanner; //importing Java's utility Scanner

public class IncomeTax {
        public static void main(String[] args) {
         
        Scanner myScanner;
        myScanner = new Scanner ( System.in ); //assigning the variable
         
    System.out.println("Enter an int giving the number of thousands- "); //asking the user for their input
    double answer = myScanner.nextdouble(); //initializing the user input into a variable
       
        if (answer < 20 && answer >=0){
            System.out.println("The tax rate on $" + answer + ",000 is 5% and the tax is $" + answer*0.05*1000);
        }//end of first if statement
        
        else if(answer >= 20 && answer < 40){
            System.out.println("The tax rate on $" + answer + ",000 is 7% and the tax is $" + answer*0.07*1000);
        }//end of second if statement
        
        else if(answer >= 40 && answer < 78){
            System.out.println("The tax rate on $" + answer + ",000 is 12% and the tax is $"+ answer*0.12*1000);
        }//end of third if statement
        
        else if(answer >= 78){
            System.out.println("The tax rate on $" + answer + ",000 is 14% and the tax is $" + answer*0.14*1000);
        }//end of fourth if statement
        
        else if(answer <0){
            System.out.println("You did not enter a positive int");
        }
        else {
            System.out.println("You did not enter an int");
        }
    }//end of main 
}//end of class
