//Yehia Awad
//yea217
//CSE2
//HW04
//This program provides the range for the courses at Lehigh University

import java.util.Scanner; //importing Java's utility Scanner

public class CourseNumber {
        public static void main(String[] args) {
         
        Scanner myScanner;
        myScanner = new Scanner ( System.in ); //assigning the variable
     
     System.out.println("Enter a six digit number giving the course semester - ");

        String course = myScanner.next();
        String year = course.substring(0,4);
        String season = course.substring(4,6);
        
        //int x = Integer.parseInt(s);
        int yearInt = Integer.parseInt(year);
        int seasonInt = Integer.parseInt(season);
        
        if (yearInt > 0){
                if (seasonInt == 10){
                        System.out.println("This course was offered in the Spring semester of " + yearInt);
                        }//end of spring semester
                else if (seasonInt == 20){
                        System.out.println("This course was offered in the Summer 1 semester of " + yearInt);
                        }//end of summer 1 semester
                else if (seasonInt == 30){
                        System.out.println("This course was offered in the Summer 2 semester of " + yearInt);
                        }//end of summer 2 semester
                else if (seasonInt == 40){
                        System.out.println("This course was offered in the Fall semester of " + yearInt);
                        }//end of fall semester
                else {
                        System.out.println(+ seasonInt +" is not a valid semester");
                }//end of error message
                }//end of originial if statement
}//end of main
}//end of class
        