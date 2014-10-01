//Yehia Awad
//yea217
//hw05
//Boola Boola

import java.util.Scanner;

public class BoolaBoola{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        
        int rand1 = (int)(Math.random()*2); //obtain values from user
        int rand2 = (int)(Math.random()*2);
        int rand3 = (int)(Math.random()*2);
        
        boolean boolboola1, boolboola2, boolboola3; 
    if (rand1 == 1){ 
            boolboola1 = true;
    }
    else{
            boolboola1 = false;
    }
    if (rand2 == 1){ 
            boolboola2 = true;
    }
    else{ 
            boolboola2 = false;
    }
    if (rand3 == 1){ 
            boolboola3 = true;
    }
    else{ 
            boolboola3 = false;
    }//end of first else before input is obtained 
        
        int randomOperator1 = (int)(Math.random()*2); //creating the random operators using the math.random function
        int randomOperator2 = (int)(Math.random()*2);
        int control1 = 0; //creating controls in order to process the operation correctly 
        int control2 = 0;
        
    if (boolboola1 == true){
            System.out.print("Does true ");
        }
        else {
            System.out.print("Does false ");
        }
        switch (randomOperator1){
            case 0:                     
                System.out.print(" &&");
                control1 = 1;           
                break;
            case 1:
                System.out.print(" ||");
                break;
        }
        if (boolboola2 == true){
            System.out.print(" true");
        }
        else {
            System.out.print(" false");
        }
        switch (randomOperator2){
            case 0:
                System.out.print(" &&");
                control2 = 1;
                break;
            case 1:
                System.out.print(" ||");
                break;
        }
        if (boolboola3 == true){
            System.out.print(" true");
        }
        else{
            System.out.print(" false");
        }//end of last statement before user input is obtained
        
        
        System.out.print(" have the value true (t/T) or false (f/F)? ");    //obtain user input 
        String input = myScanner.next(); //obtain the input entered as a string
     
        if (control1 == 1 && control2 == 0){
            if ((boolboola1 && boolboola2 || boolboola3) && input.equals("t")){
                System.out.println("You're correct");
            }
            else if (!(boolboola1 && boolboola2 || boolboola3) && input.equals("f")){
                System.out.println("You're correct");
            }
            else{
                System.out.println("Incorrect");
            }
        }//end of first if
        
        else if (control1 == 1 && control2 == 1){    
            if ((boolboola1 && boolboola2 && boolboola3) && input.equals("t")){
                System.out.println("You're correct");
            }
            else if (!(boolboola1 && boolboola2 && boolboola3) && input.equals("f")){
                System.out.println("You're correct");
            }
            else{
                System.out.println("Incorrect");
            }
        }//end of second if
        else if (control1 == 0 && control2 == 0){ 
            if ((boolboola1 || boolboola2 || boolboola3) && (input.equals("t") || input.equals("T"))){
                System.out.println("You're correct");
            }
            else if (!(boolboola1 || boolboola2 || boolboola3) && (input.equals("f") || input.equals("F"))){
                System.out.println("You're correct");
            }
            else{
                System.out.println("Incorrect");
            }
        }//end of third if
        else if (control1 == 0 && control2 == 1){  
            if ((boolboola1 || boolboola2 && boolboola3) && (input.equals("t") || input.equals("T"))){
                System.out.println("You're correct");
            }
            else if (!(boolboola1 || boolboola2 && boolboola3) && (input.equals("f") || input.equals("F"))){
                System.out.println("You're correct");
            }
            else{
                System.out.println("Incorrect");
            }//end of else
        }//end of last if statement
        
    }//end of main
}//end of class