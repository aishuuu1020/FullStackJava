import java.util.Scanner;

public class Practice_set3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name : ");
        String name = sc.nextLine();

        String line = " Dear < |name| > , thanks alot...!";
        String U_name = line.replace( "< |name| > ",name);
        System.out.println(U_name);
    }
}
