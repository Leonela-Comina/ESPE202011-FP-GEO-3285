package hw08factorialnumber;

import java.util.Scanner;

public class HW08FactorialNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Factorial Number  =======");
            System.out.println("1. -> calculate the factorial of a number ");
            System.out.println("0. -> Exit ");

            System.out.println(" Choose one of the options --> ");
            option = input.nextInt();

            switch (option) {

                case 1:

                    int factorial = 1;
                    int number = 16;

                    System.out.println("----Enter a number--- ");
                    number = input.nextInt();

                    for (int n = number; n > 0; n--) {
                        factorial = factorial * n;
                    }
                    System.out.println("The Factorial of " + number + " This is "
                            + "--> " + factorial);

                    break;

                case 0:
                    System.out.println("Good Bye ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
            }

        } while (option != 0);

    }
}
