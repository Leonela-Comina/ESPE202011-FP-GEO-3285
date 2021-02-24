package hw15.matrixoperation;

import java.util.Scanner;

/**
 *
 * @author Leonela_Comina
 */
public class HW15MatrixOperation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = 0;
        int n = 0;
        int m1 = 0;
        int n1 = 0;
        int m2 = 0;
        int n2 = 0;
        int[][] MatrixA;
        int[][] MatrixB;
        int[][] MatrixC;
        System.out.println("Matrix A");
        System.out.println("Welcome \n Plese enter Matrix A dimesion \n Rows number");
        n = input.nextInt();
        System.out.println("Plese enter Matrix A dimesion \n Columns number  ");
        m = input.nextInt();

        MatrixA = new int[m][n];
        MatrixB = new int[m][n];
        MatrixC = new int[MatrixA.length][MatrixB[0].length];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the matrix A values");
                System.out.println("Enter the a[" + (i + 1) + "][" + (j + 1) + "] = ");
                MatrixA[i][j] = input.nextInt();
            }
        }

        System.out.println("Matrix A is ");
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + MatrixA[i][j]);
            }
        }
        System.out.println("Matrix B");
        System.out.println("Plese enter Matrix B dimesion \n Rows number  ");
        n = input.nextInt();
        System.out.println("Plese enter Matrix B dimesion \n Columns number  ");
        m = input.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the matrix B values");
                System.out.println("Enter the b[" + (i + 1) + "][" + (j + 1) + "] = ");
                MatrixB[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrix B is ");
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + MatrixB[i][j]);
            }
        }

        for (int a = 0; a < MatrixB[0].length; a++) {
            for (int i = 0; i < MatrixA.length; i++) {
                int suma = 0;
                for (int j = 0; j < MatrixA[0].length; j++) {

                    suma += MatrixA[i][j] * MatrixB[j][a];
                }

                MatrixC[i][a] = suma;
            }
        }

        System.out.print("\n Matrix C is equal to");
        for (int i = 0; i < MatrixB.length; i++) {
            System.out.println("");
            for (int j = 0; j < MatrixB[0].length; j++) {
                System.out.print("\t" + MatrixC[i][j]);
            }
        }
    }
}
