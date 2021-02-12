package ws12.libraries;

/**
 *
 * @author Leonela_Comina
 */
public class WS12Libraries {

    public static void main(String[] args) {

        float squareRoot = 0.0F;
        float number = 0.0F;
        float power = 0.0F;
        float base = 0.0F;
        float exponent = 0.0F;

        number = 9;
        squareRoot = (float) Math.sqrt(number);
        System.out.println("the square root of -> " + number + " <- is -> " + squareRoot);

        number = 49;

        squareRoot = (float) Math.sqrt((float) number);
        System.out.println("the square root of -> " + number + " is " + squareRoot);

        number = 5;
        squareRoot = (float) Math.sqrt((float) number);
        System.out.println("the square root of -> " + number + " is " + squareRoot);

        base = 3;
        exponent = 2;

        power = (float) Math.pow(base, exponent);
        System.out.println(power);

        base = 2;
        exponent = 4;
        power = (float) Math.pow(base, exponent);
        System.out.println(base + "^" + exponent + "is" + power);

        base = 78;
        exponent = 5;
        power = (float) Math.pow(base, exponent);
        System.out.println(power);

        float printabsoluteValue = printAbsoluteValue(number);
        number = -5;
        printabsoluteValue = printAbsoluteValue(number);
        System.out.println("absolut Value of -> " + number + " is " + printabsoluteValue);

        number = 5;
        printabsoluteValue = printAbsoluteValue(number);
        System.out.println("absolut Value of -> " + number + " is " + printabsoluteValue);
    }

    public static float computePower(float base, float exponent) {
        float power;
        power = 0.0F;

        for (int i = 1; i <= (int) exponent; i++) {
            power = power * base;
        }
        return power;
    }

    private static float printAbsoluteValue(float number) {
        if (number < 0) {
            return -number;
        } else {
            return number;

        }
    }
}
