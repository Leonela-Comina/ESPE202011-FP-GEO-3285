
package matrixfunction;

import static ec.edu.espe.matrix.BasicMatrix.readMatrixElementsA;
import static ec.edu.espe.matrix.BasicMatrix.readMatrixElementsB;
import java.util.Scanner;

/**
 *
 * @author Leonela_Comina
 */
public class MatrixFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        int m = 0;
        int n = 0;
        int[][] matrixA;
        int[][] matrixB;
        int[][] matrixC;
        
        System.out.println("Matrix A");
        System.out.println("Welcome \n Plese enter Matrix A dimension \n Rows number");
        n = input.nextInt();
        System.out.println("Plese enter Matrix A dimension \n Columns number  ");
        m = input.nextInt();

        matrixA = new int[m][n];
        matrixB = new int[m][n];
        matrixC = new int[matrixA.length][matrixB[0].length];
        
        System.out.println("------Enter the elements of the matrix-------");
         
    matrixA = readMatrixElementsA(m, n, "A",input);
   matrixB  = readMatrixElementsB(m, n, "B",input);
   
   for (int a = 0; a < matrixB[0].length; a++) {
            for (int i = 0; i < matrixA.length; i++) {
                int suma = 0;
                for (int j = 0; j < matrixA[0].length; j++) {

                    suma += matrixA[i][j] * matrixB[j][a];
                }

                matrixC[i][a] = suma;
            }
        }

        System.out.print("\n Matrix C is equal to");
        for (int i = 0; i < matrixB.length; i++) {
            System.out.println("");
            for (int j = 0; j < matrixB[0].length; j++) {
                System.out.print("\t" + matrixC[i][j]);
            }
        }
        
     } 
}
    

