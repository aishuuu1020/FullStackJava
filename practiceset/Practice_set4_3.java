import java.util.Scanner;

public class Practice_set4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter the year to check it is leap year or not : ");
        year = sc.nextInt();

        if(year % 4 == 0 && year != 100){
            System.out.println("The year is leap year...!");
        }else{
            System.out.println("Hey Sorry this is not leap year...!");
        }
    }
}
