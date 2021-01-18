/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04_menues;

import java.util.Scanner;

/**
 *
 * @author BIOSTAR
 */
public class HW04_Menues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> Square root");
            System.out.println("2. -> Power");
            System.out.println("3. -> Porcent");
            System.out.println("4. -> Logarithm");
            System.out.println("5. -> Hexagon Area");
            System.out.println("6. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    int base;
                    float root;

                    System.out.println("enter a number -> ");
                    base = input.nextInt();

                    root=(float)Math.sqrt(base);
                    System.out.println(" The square root of " + base + 
                             " is equal to --> " + root);
                    break;
                case 2:
                    double base2;
                    double power;
                    double exponent = 0;
                    System.out.println("enter a base -> ");
                    base2 = input.nextDouble();
                    System.out.println("enter a exponent -> ");
                    exponent = input.nextDouble();
                   power= Math.pow(base2, exponent);
              System.out.println(" the power of " + base2 + " to " 
                      + exponent + " is equal to --> "+ power);
                break;


                case 3:
                    System.out.println("The porcent is ");
                    float number;
                    float porcent;
                    float result;
                    System.out.println("enter a number -> ");
                    number = input.nextFloat();
                    System.out.println("enter a porcent -> ");
                    porcent = input.nextFloat();
                    result = (number/porcent)*100;
                    System.out.println(" the porcentage is --> " + result);
                    break;



                case 4:
                    System.out.println("The natural logarithm is");
                    float logarithm;
                    float finishresult;

                    System.out.println("enter logarithm -> ");
                    logarithm= input.nextFloat();
                     finishresult =(float) Math.log(logarithm);
                    System.out.println(" the logarithm is --> " + finishresult);
                    break;



                case 5:
                    System.out.println("The Hexagon Area is");
                    float side;
                    float apothem;
                    float area;

                    System.out.println("enter side -> ");
                    side= input.nextFloat();
                    apothem =(float) (side/1.15);
                    area =(float)((3*side)*apothem);
                    System.out.println(" the area  --> " + area);
                    break;




                case 6:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 6);

    }

}
    
  
    

