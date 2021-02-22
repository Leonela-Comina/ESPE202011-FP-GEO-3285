package ws13.task;

/**
 *
 * @author Leonela_Comina
 */
public class WS13Task {

    public static void main(String[] args) {

        int base = 5;
        int height = 10;
        int majorbase = 20;
        int lowerbase = 10;
        int height1 = 2;
        int diagonalmajor = 50;
        int diagonallower = 70;
        int mass = 45;
        int acceleration = 78;
        int distance = 65;
        int velocity = 60;

        System.out.println("The Area of the Triangle is -> "
                + printTheAreaOfATriangle(base, height));
        System.out.println("The Area of the Trapeze is -> "
                + printTheAreaOfATrapeze(majorbase, lowerbase, height1));
        System.out.println("The Area of the Rhombus is -> "
                + printTheAreaOfARhombus(diagonalmajor, diagonallower));
        System.out.println("The mass of a box is 45 and its acceleration is"
                + " 78 The strength of the box is "
                + showTheFormulaOfForce(mass, acceleration));
        System.out.println("A car goes at a distance of 65 meters to a time of"
                + " 60 minutes. The speed of the car is "
                + ShowTheFormulaOfVelocity(distance, base));

    }

    public static int printTheAreaOfATriangle(int base, int height) {
        int areaTriangle;
        areaTriangle = (base * height) / 2;
        return areaTriangle;
    }

    public static int printTheAreaOfATrapeze(int majorbase, int lowerbase, int height1) {
        int areaTrapeze;
        areaTrapeze = ((majorbase + lowerbase) / 2) * height1;
        return areaTrapeze;
    }

    public static int printTheAreaOfARhombus(int diagonalmajor, int diagonallower) {
        int areaRhombus;
        areaRhombus = (diagonalmajor * diagonallower) / 2;
        return areaRhombus;
    }

    public static int showTheFormulaOfForce(int mass, int acceleration) {
        int formulaOfForce;
        formulaOfForce = (mass * acceleration);
        return formulaOfForce;
    }

    public static int ShowTheFormulaOfVelocity(int distance, int time) {
        int formulaOfVelocity;
        formulaOfVelocity = distance / time;
        return formulaOfVelocity;
    }
}
