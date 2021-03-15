package ws21.vehicles;

import java.util.Scanner;

/**
 *
 * @author Leonela_Comina
 */
public class WS21Vehicles {

    public static void main(String[] args) {

        float liters;
        float Km = 0.00F;
        float mileage;
        float oilChange;

        System.out.println("Leonela Comina");

        System.out.println("*********************************************************************************");
        System.out.println("* Please enter how many liters of gasoline you are going to use in your car  *");
        System.out.println("*********************************************************************************");
        Scanner input = new Scanner(System.in);
        liters = input.nextFloat();

        Km = calculateHowManyKmAVehicletravels(liters);

        System.out.println("Your vehicle will run " + Km + " Km " + "in " + liters + " Lt");

        System.out.println("*****************************************************");
        System.out.println("* Enter the mileage of your last oil change  *");
        System.out.println("************************************************");
        Scanner input2 = new Scanner(System.in);
        mileage = input.nextFloat();

        oilChange = calculateNextVehicleOilChange(mileage);

        System.out.println("The oil change of your vehicle is in  " + oilChange + " Km ");

    }

    public static float calculateHowManyKmAVehicletravels(float liters) {
        float Km = 0.00F;
        Km = (float) ((liters * 45) / 3.78);
        return Km;
    }

    public static float calculateNextVehicleOilChange(float mileage) {
        float oilChange = 0.0F;
        oilChange = (float) (mileage + 5000);
        return oilChange;

    }

}
