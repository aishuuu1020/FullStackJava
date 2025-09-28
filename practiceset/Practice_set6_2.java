import java.util.Scanner;

public class Practice_set6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an Array : ");
        int size = sc.nextInt();

        int[] MyArray = new int [size];

        System.out.println("Enter "+ size + "elements: ");
        for(int i=0; i<MyArray.length; i++){
            MyArray[i]= sc.nextInt();
        }

        int n;
        System.out.println("Enter element to search : ");
        n = sc.nextInt();
        boolean found = false;

        for(int i=0; i<MyArray.length; i++){
            if(n==MyArray[i]){
                System.out.println("Element is present in array....!");
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Element is not present in an Array....!");
        }

    }
}
