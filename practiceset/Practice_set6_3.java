import java.util.Scanner;

public class Practice_set6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=0;
        int average;

        System.out.println("Enter size of an array: ");
        int size = sc.nextInt();


        int[] Physics = new int[size];

        System.out.println("Enter "+size + " Students Marks : ");
        for(int i=0; i<Physics.length;i++){
            Physics [i]= sc.nextInt();
            total = total+Physics[i];
        }

        System.out.println("Array is ");
        for(int i=0; i<Physics.length; i++) {
            System.out.print(Physics[i] +" ");
        }

        average = total/size;
        System.out.println("\nAverage is : "+average);

    }
}
