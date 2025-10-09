import java.util.Scanner;

public class Practiceset7_6 {

    static void Running(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println("n = " + n);
            Running(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Running(n);
    }
}
