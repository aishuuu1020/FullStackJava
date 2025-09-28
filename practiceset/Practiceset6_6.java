import java.util.Scanner;

public class Practiceset6_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an Array : ");
        int size = sc.nextInt();

        int[] Arr = new int [size];

        System.out.println("Enter "+ size + " Array : ");
        for(int i=0; i<Arr.length; i++){
            Arr[i]=sc.nextInt();
            System.out.print(Arr[i]);
            System.out.print(" ");
        }
        System.out.print("\n");

        int Min = Arr[0];
        for(int i=0; i<Arr.length; i++){
            if(Arr[i]<Min){
                Min=Arr[i];
            }

        }
        System.out.print("The minimum element of an array is : "+ Min);
    }
}
