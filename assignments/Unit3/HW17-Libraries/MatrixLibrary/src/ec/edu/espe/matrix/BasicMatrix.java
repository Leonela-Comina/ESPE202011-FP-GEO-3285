/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.matrix;

import java.util.Scanner;

/**
 *
 * @author BIOSTAR
 */
public class BasicMatrix {
   public static int [][] readMatrixElementsA(int m,int n,String matrix,Scanner input){
    int [][] matrixA;
    matrixA = new int [m][n];
    for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the matrix A values");
                System.out.println("Enter the a[" + (i + 1) + "][" + (j + 1) + "] = ");
                matrixA[i][j] = input.nextInt();
            }
    }
     System.out.println("Matrix A is ");
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + matrixA[i][j]);
        }
             

}return matrixA;

}
   public static int [][]readMatrixElementsB(int m, int n,String matrix,Scanner input){
   int [][] matrixB;
   matrixB = new int [m][n];
   for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("");
                System.out.println("Enter the matrix B values");
                System.out.println("Enter the b[" + (i + 1) + "][" + (j + 1) + "] = ");
                matrixB[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrix B is ");
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + matrixB[i][j]);
            }
        }
    return matrixB ;

    
}


    }    
   
