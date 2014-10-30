//Yehia Awad
//CSE2
//yea217


import java.util.Scanner;

public class HW8{
  public static char getInput(Scanner answer, String chars){  
   String number = answer.next(); //declaring the user input as a string
   
   if(number.length() != 1){
       System.out.println("You should enter exactly one character - ");
   }//error message if not entered 1 variable
   
   else{
       char Ch = number.charAt(0);
       
    if(chars.indexOf(Ch) != -1){
        return Ch;
    }//end of nested if
    
    else{
        System.out.println("You did not enter a character from the list " + chars + "; try again- ");
        
    }//end of nested else
   }return ' ';//end of else
                }//end of first method

  
  public static char getInput(Scanner answer, String chars, int trials){
    
    for(int a = 0; a < trials; a++){
     
    String number = answer.next(); //declaring the user input as a string
    
    if(number.length() != 1){
       System.out.println("You should enter exactly one character - ");
   }//error message if not entered 1 variable
   
    }//end of for loop
    
    System.out.println(); //print error message
    System.out.println("You failed after " + trials + "trials");
    return ' ';
                }//end of second method
  
  public static char getInput(Scanner answer, String prompt, String chars){
    String number = answer.next();
      
    while(true){
        
        System.out.println(prompt);
        System.out.print("Enter one of: ");
    
    for(int a = 0; a < chars.length(); a++){ //start of for loop
        System.out.print("'" + chars.charAt(a) + "', "); //print out each char
    } 
    
    System.out.print("- ");
    String value = answer.next();
    System.out.println();
    
    if(value.length() != 1){ //test for length
        System.out.println("Enter only one character");
    }  //end of if 
      
    else{
       char Ch = number.charAt(0);
       
    if(chars.indexOf(Ch) != -1){
        return Ch;
    }//end of nested if
    
    else{
        System.out.println("You did not enter a character from the list " + chars + "; try again- ");
        
    }//end of nested else
    }//end of else
  }//end of while loop
  }//end of second method
  
  
  public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in); //declaring the scanner

	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); 
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
  
                }//end of third method
}//end of class

