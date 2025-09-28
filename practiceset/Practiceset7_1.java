import java.util.Scanner;

public class Practiceset7_1 {

     void Multiplication_table(int n){
        for(int i=1; i<=10; i++){
            int result= n*i;
            System.out.println("Table is : " + result);
        }
         int result;
         return ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number : ");
        n= sc.nextInt();

        Practiceset7_1 obj = new Practiceset7_1();
        obj.Multiplication_table(n);

    }
}
