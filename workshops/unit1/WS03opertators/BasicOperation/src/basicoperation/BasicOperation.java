/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperation;

import static java.time.Clock.system;

/**
 *
 * @author BIOSTAR
 */
public class BasicOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int sum; 
    int addend1;
    int addend2;
    int difference;
    int minuend;
    int subtrahend;
    int product;
    int multiplicant;
    int multiplier;
    int dividend;
    int divisor;
    int quotien;
    int remainder;
    
    addend1 = -5;
    addend2 = 18;      
    minuend = -23;
    subtrahend = -6;
    multiplicant = 4;
    multiplier = -9;
    dividend = 14;
    divisor = 7;        
    
    sum = addend1 + addend2;
            
System.out.println("the addition of " + addend1 + " + " + addend2 + 
        " is equal to --> " + sum);
    
difference = minuend - subtrahend;  
      
System.out.println("the substration of " + minuend + " - " + subtrahend + 
        " is equal to --> " + difference);

product = multiplicant * multiplier;

System.out.println(" the multiplication of "+ multiplicant + " * " + multiplier 
        + " is equal to -->" + product);
   
quotien= dividend / divisor;
    
System.out.println("the division of "+ dividend + " / " + divisor + 
        " is equal to --> " + quotien);    

remainder = dividend % divisor;

System.out.println("the division remainder of " + dividend + " % " + divisor + 
        " is equal to --> " + remainder);
    }
    
}
   
           

