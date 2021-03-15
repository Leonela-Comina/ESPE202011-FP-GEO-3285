/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws22.modularcalculator;

import java.util.Scanner;
import utils.BasicOperation;
/**
 *
 * @author BIOSTAR
 */
public class WS22ModularCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     float operand1;
     float operand2;
     float result;
     
     Scanner input = new Scanner (System.in);
    
    System.out.println("----Enter two numbers----");
             
    operand1 = input.nextFloat();     
    operand2 = input.nextFloat();
    result = BasicOperation.addTwoNumbers(operand1,operand2);
    System.out.println("----ADDITION----");
    System.out.println("the addition of " + operand1 + " + " + operand2 + 
        " is equal to --> " + result);
    result = BasicOperation.subtractTwoNumbers(operand1,operand2);
    System.out.println("----SUBTRACTION----");
    System.out.println("the subtraction of " + operand1 + " - " + operand2 + 
        " is equal to --> " + result);
     result = BasicOperation.multiplyTwoNumbers(operand1,operand2);
    System.out.println("----MULTIPLICATION----");
    System.out.println("the multiplication of " + operand1 + " * " + operand2 + 
        " is equal to --> " + result);
    result = BasicOperation.divideTwoNumbers(operand1,operand2);
    System.out.println("----DIVISION----");
    System.out.println("the division of " + operand1 + " / " + operand2 + 
        " is equal to --> " + result);
     }
    
}
