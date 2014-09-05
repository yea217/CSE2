///
//Yehia Awad
//yea217
//cse2
//lab02 - cylcometer
public class Cyclometer{
    
public static void main(String [] args){
    
int secsTrip1=480; //first trip in seconds
int secsTrip2=3220; //second trip in seconds
int countsTrip1=1561; //first trip in rotations
int countsTrip2=9037; //second trip in rotations

double wheelDiameter=27.0;
double PI=3.14159; //constant pi
double feetPerMile=5280; //conversion factor between feet and mile
double inchesPerFoot=12; //conversion factor between inches and feet
double secondsPerMinute=60; //converstion factor between seconds and minutes
double distanceTrip1;
double distanceTrip2;
double totalDistance; //variables for the distances

// printing out the values of the trips

System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts.");
System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");

distanceTrip1=countsTrip1*wheelDiameter*PI;

// Above gives distance in inches
//(for each count, a rotation of the wheel travels
//the diameter in inches times PI) 

distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles 
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; 

totalDistance=distanceTrip1+distanceTrip2;
System.out.println("Trip 1 was "+distanceTrip1+" miles");
System.out.println("Trip 2 was "+distanceTrip2+" miles"); 
System.out.println("The total distance was "+totalDistance+" miles");
}
}