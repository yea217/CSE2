//Yehia Awad
//yea217
//hw06


import java.util.Scanner;

public class Roulette{
    public static void main(String[] args){
        
        Scanner myScanner;
        
        myScanner = new Scanner(System.in);
        
    int a = 0;
    int bet = 10;
    int nLoss = 0;
    int profit = 0;
    int nProfit = 0;
    
    while(a<1000){
        
        int b = 0;
        
        while (b<100){
            
            int random = (int)(Math.random()*39);
            
        b++;
        
        if (random == bet){
            profit = profit + 36;
            nProfit = nProfit + 1;
        }//end of profit if
        
        if (random != bet){
            nLoss = nLoss + 1;
        }//end of loss
        
        }//end of second while
        
        a++;
    }//end of first while  
    
System.out.println("Number of times won " + nProfit);
System.out.println("Amount of profit made " + profit);
System.out.println("Amount of times lost " + nLoss);

    }//end of main
}//end of class