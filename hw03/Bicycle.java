/////
//Yehia Awad
//CSE2
//yea217
//Bicycle
/*This program takes in your input for the rotations
and time of the bike ride and returns the speed of the 
bike and the time of the trip*/

import java.util.Scanner; //importing the java utility scanner

public class Bicycle {
        public static void main(String[] args) {
            
            
   
         Scanner myScanner;
     
         myScanner = new Scanner ( System.in ); //assigning the variable
         
    double distanceTrip;
    double hours;
    double minutes;
    double speed;
    double conversion;
    double inchesPerFoot = 12.0;
    double feetPerMile = 5280.0;
    double wheelDiameter = 27.0;
    double PI = 3.14159;
    
    distanceTrip = inchesPerFoot*feetPerMile; // Converts to distance in miles    
    
    System.out.println("Enter the number of seconds: "); //asking the user for their input on seconds
    int seconds = myScanner.nextInt(); //initializing the user input into a variable
    minutes = seconds/60;
    hours = minutes/60;
    
    System.out.println("Enter the number of counts: ");//asking the user for their input on counts
    int counts = myScanner.nextInt(); //obtaining the information into a variable
    distanceTrip = counts*wheelDiameter*PI;
    distanceTrip = distanceTrip/(inchesPerFoot*feetPerMile);
    
    speed = distanceTrip/hours;
    
    distanceTrip*=100;
    distanceTrip = (int)distanceTrip;
    distanceTrip = (double)distanceTrip;
    distanceTrip/=100;
    
    
    speed*=100;
    speed = (int)speed;
    speed = (double)speed;
    speed/=100;
    
    System.out.println("The distance was " + distanceTrip + "miles and took " + minutes + " minutes.The average mph was " + speed);
    
        }
}
