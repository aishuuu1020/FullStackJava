import java.util.Scanner;

public class Practiceset7_3 {

    static int SumOfNaturalNo(int n){
        if(n==1){
            return 1;
        }else{
            return n + SumOfNaturalNo(n-1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The No : ");
        int n = sc.nextInt();

        int sum = SumOfNaturalNo(n);
        System.out.println("Sum of First " + n + "Natural no is : " + sum);
    }
}
