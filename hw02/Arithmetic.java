////////////
//Yehia Awad
//hw02
//cse2
//yea217
//This program is meant to help make calculations when purchasing items at Walmart




public class Arithmetic{
    
    //add main method
    public static void main(String[] args){
        
 double taxPercent=0.06;
 
    int nSocks=3; //Number of pairs of socks
        double sockCost$=2.58;  //Cost per pair of socks
        
        double totalSock$ = nSocks*sockCost$; //total cost of the socks before tax
            totalSock$ = totalSock$ *100;
            totalSock$ = (int)totalSock$;
            totalSock$ = totalSock$/100;
            
        double salesSock$ = totalSock$*taxPercent; //sales tax for total cost of socks
            salesSock$ = salesSock$ *100;
            salesSock$ = (int)salesSock$;
            salesSock$ = salesSock$/100;
            
        double finalSock$ = totalSock$ + salesSock$; //final price for socks
            finalSock$ = finalSock$ *100;
            finalSock$ = (int)finalSock$;
            finalSock$ = finalSock$/100;
    
    
    int nGlasses=6; //Number of drinking glasses
        double glassCost$=2.29;//Cost per glass

        double totalGlass$ = nGlasses* glassCost$; //total cost of the glasses before tax
            totalGlass$ = totalGlass$ *100;
            totalGlass$ = (int)totalGlass$;
            totalGlass$ = totalGlass$/100;
            
        double salesGlass$ = totalGlass$* taxPercent; //sales tax for total cost of glass
            salesGlass$ = salesGlass$ *100;
            salesGlass$ = (int)salesGlass$;
            salesGlass$ = salesGlass$/100;
            
        double finalGlass$ = totalGlass$ + salesGlass$; //final price for glass
            finalGlass$ = finalGlass$ *100;
            finalGlass$ = (int)finalGlass$;
            finalGlass$ = finalGlass$/100;
    
    int nEnvelopes=1; //Number of boxes of envelopes
        double envelopeCost$=3.25; //cost per box of envelopes
            envelopeCost$ = envelopeCost$ * 100;
            envelopeCost$ = (int)envelopeCost$;
            envelopeCost$ = envelopeCost$/100;
            
        double totalEnvelope$ = nEnvelopes*envelopeCost$;
            totalEnvelope$ = totalEnvelope$ * 100;
            totalEnvelope$ = (int)totalEnvelope$;
            totalEnvelope$ = totalEnvelope$/100;//total cost of the envelopes before tax
            
        double salesEnvelope$ = totalEnvelope$* taxPercent; //sales tax for total cost of envelope
            salesEnvelope$ = salesEnvelope$ * 100;
            salesEnvelope$ = (int)salesEnvelope$;
            salesEnvelope$ = salesEnvelope$/100;
            
        double finalEnvelope$ = totalEnvelope$ + salesEnvelope$; //final price for envelope
            finalEnvelope$ = finalEnvelope$ * 100;
            finalEnvelope$ = (int)finalEnvelope$;
            finalEnvelope$ = finalEnvelope$/100;

    
    double totalcostbeforetax = totalSock$ + totalEnvelope$ + totalGlass$; //total cost before tax
            totalcostbeforetax = totalcostbeforetax * 100;
            totalcostbeforetax = (int)totalcostbeforetax;
            totalcostbeforetax = totalcostbeforetax/100;
    double totalsalestax = totalcostbeforetax* taxPercent; //total sales cost
            totalsalestax = totalsalestax * 100;
            totalsalestax = (int)totalsalestax;
            totalsalestax = totalsalestax/100;
    double finaltotalprice = totalcostbeforetax + totalsalestax; //final price for everything
            finaltotalprice = finaltotalprice * 100;
            finaltotalprice = (int)finaltotalprice;
            finaltotalprice = finaltotalprice/100;
    
    
     System.out.println((" The total cost of the 3 socks at $2.58/sock is ") +totalSock$);
     System.out.println((" The sales tax of the socks is ") +salesSock$);
     System.out.println((" The final price of the socks is ") +finalSock$);
     System.out.println();
     
     System.out.println((" The total cost of the 6 glasses at $2.29/glass is ") +totalGlass$);
     System.out.println((" The sales tax of the glasses is ") +salesGlass$);
     System.out.println((" The final price of the glasses is ") +finalGlass$);
     System.out.println();
     
     System.out.println((" The total cost of the 1 envelope at $3.25/glass is ") +totalEnvelope$);
     System.out.println((" The sales tax of the envelope is ") +salesEnvelope$);
     System.out.println((" The final price of the envelope is ") + finalEnvelope$);
     System.out.println();
     
     System.out.println((" The total price before the sales tax is ") +totalcostbeforetax);
     System.out.println((" The total sales tax is ") +totalsalestax);
     System.out.println((" The final total price is ") +finaltotalprice);
     System.out.println();
    }
}