package practiceset;

import java.util.Scanner;

public class Practiceset6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an Array : ");
        int size = sc.nextInt();

        int[] My_array = new int[size];

        System.out.println("Enter " + size + " elements : ");
        for(int i=0; i<My_array.length;i++){
            My_array[i] = sc.nextInt();
            System.out.print(  My_array[i] );
            System.out.print(" ");
        }
        System.out.println("\n");

        int Max = My_array[0];
        for (int i = 0; i < My_array.length; i++) {
            if (My_array[i] > Max) {
                Max = My_array[i];
            }
        }
        System.out.println("The maximum number : " + Max);
    }
}