package practiceset;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Practice_set6_4 {

    // [ 2, 3, 4]    +  [ 8, 9, 2]   =  [ 10, 12, 6 ]
    // [4, 5, 7 ]       [ 0, 6, 1]      [ 4, 11, 8 ]
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int m = 2, n=3;
        int [][] Array1 = new int[m][n];
        int [][] Array2 = new int[m][n];
        int [][] Sum = new int[m][n];

        System.out.println("Enter the Matrix1 of size 2 rows and 3 columns: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                Array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Matrix2 of size 2 rows and 3 columns: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                Array2[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Matrix1 is: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print("[" +Array1[i][j] + "]");
                System.out.print(" ");
            }
            System.out.print("\n");
        }

        System.out.println("The Matrix2 is: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print("[" +Array2[i][j] + "]");
                System.out.print(" ");
            }
            System.out.print("\n");
        }

        System.out.println("The Addition of Matrix is: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                Sum[i][j] = Array1[i][j] + Array2[i][j];
                System.out.print("[" + Sum[i][j] +"]");
                System.out.print(" ");
            }
            System.out.print("\n");
        }

    }

}