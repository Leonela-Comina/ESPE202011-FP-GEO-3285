/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxdeclaration;





import java.util.Scanner;

import ec.edu.espe.Tax.BasicTax;
/**
 *
 * @author Leonela_Comina
 */
public class TaxDeclaration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float basePrice;
        float totalPrice;
        final float ivaPercentage = 12;
        float ivaValue;
        Scanner input = new Scanner (System.in);
        
        System.out.println("----Leonela Comina Taxes----");
        System.out.println("IVA");
        System.out.println("Enter the price of your products");
       basePrice = input.nextFloat();
        
       ivaValue =BasicTax.computeIVA(basePrice , ivaPercentage);
       totalPrice = basePrice + ivaValue;
        System.out.println("Total Price " + totalPrice);
        
    }
    
}
