
package ws15correctionquizarrays;

import java.util.Scanner;

/**
 *
 * @author Leonela_Comina
 */
public class WS15CorrectionQuizArrays {
 public static void main(String[] args) {
 
     int numberOfAnimals = 0;
        String[] animals;
        float[] weight;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of animals you want to register -> ");
         numberOfAnimals = scanner.nextInt();

        animals = new String[numberOfAnimals];
        weight = new float[numberOfAnimals];

        for (int i = 0; i < numberOfAnimals; i++) {
            scanner.nextLine();
            System.out.print(" Please enter the name of the animal # " + (i+1) + " -> ");
            animals[i] = scanner.nextLine();
            System.out.print(" Please enter " + animals[i] + " weight ->");
            weight[i] = scanner.nextFloat();
        }

        System.out.println(" Animals    -> \t  weight ");

        for (int i = 0; i < numberOfAnimals; i++) {
            System.out.println(animals[i] + " ->  \t " + weight[i]);
        }

    }

}