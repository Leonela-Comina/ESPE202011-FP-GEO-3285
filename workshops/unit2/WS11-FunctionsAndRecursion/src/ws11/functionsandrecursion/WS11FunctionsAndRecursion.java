package ws11.functionsandrecursion;

/**
 *
 * @author Leonela_Comina
 */
public class WS11FunctionsAndRecursion {

    public static void main(String[] args) {
    
        System.out.println(" AUTHOR: LEONELA COMINA ");
        int divd = 5;
        int divr = 10;
        float quotient = 0;
        int x = 0;
        int y = 0;

        quotient = divideTwoNumbers(divd, divr);

        System.out.println("Quotient of 5 and 10 is -> " + quotient);
        y = f(3);
        System.out.println("3^2 -> " + y);

        y = f(-3);
        System.out.println("-3^2 -> " + y);

        x = -1;
        y = f(x);
        System.out.println("the square of -> " + x + " <- is equal to -> " + y);

        int number = 5;
        int fact = 0;
        fact = factorial(number);
        System.out.println("factorial of " + number + " is equal to -> " + fact);

    }

    public static float divideTwoNumbers(int dividend, int divisor) {

        float quotient = 0.0F;
        quotient = (float) dividend / (float) divisor;
        return quotient;
    }

    public static int f(int x) {
        int y = 0;

        y = x * x;

        return y;
    }

    public static int g(int x) {
        int y = 0;

        y = x * x + 2 * x + 1;

        return y;
    }

    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else {
            if (n == 0) {
                return 1;
            } else {
                return (n * factorial(n - 1));
            }
        }
    }

}
