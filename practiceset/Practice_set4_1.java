import java.util.Scanner;

public class Practice_set4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int math_marks , chemistry_marks , physics_marks;

        System.out.println("Enter the maths marks : ");
        math_marks = sc.nextInt();

        System.out.println("Enter the chemistry marks : ");
        chemistry_marks = sc.nextInt();

        System.out.println("Enter the physics marks : ");
        physics_marks = sc.nextInt();

        int total = math_marks+physics_marks+chemistry_marks;
        int percentage = total/3;

        if(percentage>=40 && math_marks>=33 && physics_marks>=33 && chemistry_marks>=33){
            System.out.println("You passed with "+ percentage+"%");
        }else{
            System.out.println("You failed with " + percentage+"%");
        }

    }
}
