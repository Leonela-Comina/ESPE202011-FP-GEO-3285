
package ws08examq11correction;

import java.util.Scanner;

public class WS08ExamQ11Correction {
    
    public static void main(String[] args) {

        int multiplicand = 0;
        int multiplier = 1;
        int product;
        int stop = 12;

    do {
    System.out.println("Enter the table you want to study ");
    Scanner input = new Scanner(System.in);
       multiplicand = input.nextInt();

    System.out.println("Multiplication table --> " + multiplicand + " <--");
        for (multiplier = 1; multiplier <= stop; multiplier++) {
              product = multiplicand * multiplier;
    System.out.println(multiplicand + " * " + multiplier + " = " + product);
    }
    System.out.println("  If you want to exit, type 0 --> ");
        
       } while (multiplicand != 0);
        
    System.out.println("Good bye");
    }

}
