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
public class LinearSearch {
    
    public static int search(int age[], int ageToFind) {
        int n = age.length;
        for (int i = 0; i < n; i++) {
            if (age[i] == ageToFind) {
                return i;
            }
        }
        return -1;
    }
}
   
   
    



