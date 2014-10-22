//Yehia Awad
//yea217
//NumberStack
//Yehia Awad

import java.util.Scanner; //importing the java utility scanner

public class NumberStack{
	public static void main(String[] arg){
Scanner myScanner;
myScanner = new Scanner (System.in);

//prompt user for their input
System.out.println("Enter an int beteween 1 and 9: ");
int input = myScanner.nextInt();

System.out.println("For loops: ");
for (int a=1; a<=input; a++){
    for (int b=1; b<=a; b++){
        for(int c=0; c<(2*a-1); c++){
        System.out.print(a);
        }
    System.out.println();
    }

    for (int d=0; d<(2*a-1); d++){
    System.out.print("-");
        }
  System.out.println();
    }
    
    
System.out.println("While loops: ");
int a=1;
    while(a<=input){
        System.out.println();
        int b=1;
        while (b<=a){
            int c=0;
            while(c<(2*a-1)){
                System.out.print(a);
                c++;
            }//end of c while
        System.out.println();
            b++;
        }//end of b while
        int d=0;
        while(d<(2*a-1)){
            System.out.print("-");
            d++;
        }//end of d while
    System.out.println();
    a++;
    }//end of a while
    
    
    
System.out.println("Do While loops");

do{
    System.out.println();
    int b=1;
    do {
        int c=0;
        do{
            System.out.print(a);
            c++;
        }while(c<(2*a-1));
            System.out.println();
            b++;
    }while(b<=1);
            int c=0;
        //end of b while
        int d=0;
    do{
        System.out.print("-");
        d++;
        
    }while(d<(2*a-1));
        System.out.println();
        
        a++;
    }while(a<=input);
}//end of main method
}//end of class