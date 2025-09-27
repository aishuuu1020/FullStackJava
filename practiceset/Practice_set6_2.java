import java.util.Scanner;

public class Practice_set6_2 {
    public static void main(String[] args) {
        int [] MyArray= {1,2,3,4,8,6};

        Scanner sc = new Scanner(System.in);
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
