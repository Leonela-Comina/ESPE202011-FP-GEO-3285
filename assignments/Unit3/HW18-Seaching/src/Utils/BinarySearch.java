/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author Leonela_Comina
 */
public class BinarySearch {
    public static int binarySearch(int age[], int left, int right, int ageToFind) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (age[mid] == ageToFind) 
                return mid;
            
                if (age[mid] > ageToFind) 
                    return binarySearch(age, left, mid - 1, ageToFind);
                
                    return binarySearch(age, mid + 1, right, ageToFind);
                }
         return -1;
   }
}

