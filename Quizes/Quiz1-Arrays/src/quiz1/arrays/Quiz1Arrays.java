
package quiz1.arrays;

import java.util.Scanner;

/**
 *
 * @author Leonela_Comina
 */
public class Quiz1Arrays {

   
    public static void main(String[] args) {
 int[]wildAnimals;
  String[]animals1 = {"Elephant"," polar bear"," Lion"};
  Scanner input = new Scanner(System.in);
  int n;
        System.out.println("enter the number of animals ->" );
         n =   input.nextInt();
    wildAnimals = new int[n];
    
    for( int i = 0; i<n;i++){
        System.out.println("Enter the weight of the animal " + (i+1)+ "->");
        wildAnimals[i] = input.nextInt();
    } 
        
       for( String animal : animals1){
        System.out.println("the weight of these wild animals are ->" + animal);
         }
}
}