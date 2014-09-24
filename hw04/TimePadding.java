//Yehia Awad
//yea217
//CSE2
//HW04
//This program provides the range for the months of the year

import java.util.Scanner; //importing Java's utility Scanner

public class TimePadding {
        public static void main(String[] args) {
         
        Scanner myScanner;
        myScanner = new Scanner ( System.in ); //assigning the variable
        
        System.out.println("Enter the time in seconds "); 
        int answer = myScanner.nextInt(); //obtaining the input as a variable
        
        double hours = (answer/ 3600.0); //convert to hours
        int inthours = (int)hours; //cast hours as an integer
        double hoursfinal = hours - inthours; //obtain final hours
        
        double minutes = (hoursfinal * 60.0); //convert to minutes
        int intminutes = (int)minutes; //cast minutes as an integer
        double minutesfinal = minutes - intminutes; //obtain final minutes
        
        double seconds = (minutesfinal * 60.0); //convert to seconds
        int intseconds = (int)seconds; //cast seconds as an integer
        double secondsfinal = seconds - intseconds; //obtain final seconds
        
        if (intminutes < 10){
                System.out.print(inthours + ":0"+ intminutes);
        } //adding the zero for the minutes
        
        else {
                System.out.print(inthours + ":" + intminutes);
        } //adding the minutes and seconds
        
        if (intseconds < 10){
                System.out.print(":0"+intseconds);
        } //adding the zero for the seconds
        else {
                System.out.print(":" +intseconds);
        }
        
        }//end of main
}//end of class