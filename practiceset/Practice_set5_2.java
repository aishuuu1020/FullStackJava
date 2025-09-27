import java.util.Scanner;

public class Practice_set5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Enter the no : ");
        int n=sc.nextInt();
        int sum=0;
        while(i<n){
            if(i%2==0){
                sum = sum + i;

            }
            i++;
        }
        System.out.println("The sum is : "+ sum);
    }
}
