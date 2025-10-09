package practiceset;

import java.util.Scanner;

public class Practiceset7_4 {
    
    // 0 1 1 2 3 5 8 13 21 34 55
    static int Fiboncci(int n){

        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return Fiboncci(n-1)+ Fiboncci(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int result = Fiboncci(n);

        System.out.println("The " +n+"th term of the fibonacci series is : " + result);

    }
}
