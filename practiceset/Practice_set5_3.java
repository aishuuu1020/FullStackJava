import java.util.Scanner;

public class Practice_set5_3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");
        n =sc.nextInt();

        for(int i=1; i<11; i++){
            int num = n*i;
            System.out.println("The table is : " + num);
        }

    }
}
