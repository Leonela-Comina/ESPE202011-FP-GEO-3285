
package hw18.seaching;

import java.util.Scanner;
import Utils.BinarySearch;
import Utils.LinearSearch;

import Utils.LinearSearch;

import Utils.LinearSearch;

/**
 *
 * @author Leonela_Comina
 */
public class HW18Seaching {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        int age[] ={12,24,50,45,3,20,18,35,66,95,80,5,8,15,17,26,10,2,18,9,90};
        int ageToFind;
        int binaryResponse = 0;
        int linearSearch;
        int right;
        int mid = 1;

        System.out.println("Enter the age you want to search starting from two years old");
        ageToFind = input.nextInt();

        System.out.println("Welcome \n Linear Search");

        linearSearch = LinearSearch.search(age, ageToFind);
        System.out.println(ageToFind + " is in the index: " + linearSearch);

        right = age.length - 1;
        binaryResponse = BinarySearch.binarySearch(age, mid + 1, right, ageToFind);

        System.out.println("Binary Search");
        System.out.println("Element found at index " + binaryResponse);
    }
}
    
    

