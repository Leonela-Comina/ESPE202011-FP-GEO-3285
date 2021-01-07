/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp02_controlstatement;

import java.util.Scanner;

/**
 *
 * @author BIOSTAR
 */
public class FP02_controlStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
System.out.println("Enter an Integer number:");

    Scanner input= new Scanner(System.in);
    int num = input.nextInt();

    if ( num % 2 == 0 )
        System.out.println("The number entered is even");
     else
        System.out.println("The number entered is odd");
  }
}
