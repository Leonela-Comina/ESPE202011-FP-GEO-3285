package hw10.functions;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author Leonela_Comina
 */
public class HW10Functions {

    public static void main(String[] args) {

        int num1;
        int num2;
        float quotient = 0;
        int square;
        int square2;
        int function;
        int function2;
        int product;
        int top = 12;
        int table;
        int n = 1;
        System.out.println("***************************");
        System.out.println("* Please enter a number   *");
        System.out.println("***************************");
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        System.out.println("***************************");
        System.out.println("* Please enter a number   *");
        System.out.println("***************************");

        Scanner input2 = new Scanner(System.in);
        num2 = input.nextInt();

        System.out.println("==================================================================");

        quotient = divideTwoNumbers(num1, num2);

        System.out.println("the result of the division of " + num1 + "/"
                + num2 + "->" + quotient);

        System.out.println("==================================================================");

        square = findASquare(num1);

        System.out.println("The square of " + num1 + " is -> " + square);

        System.out.println("******************************************************************");

        square2 = findASquare2(num2);

        System.out.println("the square of " + num2 + " is -> " + square2);

        function = searchAFunction(num1);

        System.out.println("==================================================================");

        System.out.println("The value of the function x2 + 2x + 1 at " + num1
                + " is equal to " + function);

        function2 = searchAFunction2(num2);

        System.out.println("******************************************************************");

        System.out.println("The value of the function x2 + 2x + 1 at " + num2
                + " is equal to " + function2);

        System.out.println("==================================================================");

        product = showMeTheMultiplicationTable(num1);

        System.out.println("The multiplication table");

        System.out.println("==================================================================");

    }

    public static float divideTwoNumbers(int num1, int num2) {
        float quotient = 0.00F;
        quotient = (float) num1 / (float) num2;
        return quotient;
    }

    public static int findASquare(int num1) {
        int square = num1 * num1;
        return square;
    }

    public static int findASquare2(int num2) {
        int square2 = num2 * num2;
        return square2;

    }

    public static int searchAFunction(int num1) {
        int function = num1 * num1 + 2 * num1 + 1;
        return function;
    }

    public static int searchAFunction2(int num2) {
        int function2 = num2 * num2 + 2 * num2 + 1;
        return function2;
    }

    public static int showMeTheMultiplicationTable(int num1) {
        int product = 0;
        int top = 12;
        for (int n = 1; n <= top; n++) {

            product = num1 * n;
            System.out.println(num1 + " * " + n + " = " + product);
        }
        return product;

    }
}
