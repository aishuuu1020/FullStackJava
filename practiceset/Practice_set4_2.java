import java.util.Scanner;

public class Practice_set4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long income;

        System.out.println("Enter your total Income : ");
        income= sc.nextLong();

        if(income>250000 && income<=500000 ){
            float taxAmount = income-250000;
            float tax = (taxAmount/100)*5;
            System.out.println("Tax for the " +taxAmount+" is : "+ tax);

        }else if(income>500000 && income<=1000000){
            float taxAmount = income-500000;
            float tax = (taxAmount/100)*20;
            System.out.println("Tax for the "+taxAmount+" is : "+tax);

        } else if (income>1000000){
            float taxAmount = income-1000000;
            float tax = (taxAmount/100)*30;
            System.out.println("Tax for the "+taxAmount+" is : "+tax);
        }else{
            System.out.println("There is no tax for this Amount..!");
        }

    }
}
