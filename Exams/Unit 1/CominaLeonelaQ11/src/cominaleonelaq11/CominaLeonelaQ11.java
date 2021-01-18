package cominaleonelaq11;

import java.util.Scanner;

public class CominaLeonelaQ11 {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> Multiplication Tables");
            System.out.println("0. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();
            
          
            switch (option) {

                case 1:
                    
            
              int top=12;
              int product;
              int table;
              System.out.println("Enter the table you table you want to "
                      + "study -->");       
              table = input.nextInt();
              for(int n = 1 ; n<= top ; n++){
                  
              product = table * n;
                System.out.println(table + " * " + n +  " = " + product);
               product++;
              }
                break;
                       
               case 0:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        }while (option != 0);

    }
}