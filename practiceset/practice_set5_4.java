import java.util.Scanner;

public class practice_set5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter a number : ");
        num = sc.nextInt();
        int fact =1;
        for(int i=num; i>=1; i--){
            fact = fact*i;

        }
        System.out.print("The factorial of a "+ num +" is "+fact);
    }
}
