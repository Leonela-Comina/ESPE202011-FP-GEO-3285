package hw12.recursion;

import java.util.Scanner;

/**
 *
 * @author Leonela_Comina
 */
public class HW12Recursion {

    public static void main(String[] args) {
        int option = 0;
            
        int number;
                
        System.out.println("***************************");
        System.out.println("* Please enter a number   *");
        System.out.println("***************************");

        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        System.out.println("The sum is esqual to --> " + demonstrateASum(number));
        
    }
 
    public static int demonstrateASum(int number) {

        int sum = 0;

        for (int num = 1; num <= number; num++) {
            sum += num;

            System.out.println(sum);
        }

        return sum;

    }
}
