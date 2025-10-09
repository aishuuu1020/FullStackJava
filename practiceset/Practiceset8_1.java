import java.util.Scanner;

class Employe{
    public int salary;
    public String name;
    public String ChangeName;

    Scanner sc = new Scanner(System.in);


    public void getSalary(){
        System.out.println("Enter a Salary : ");
        salary = sc.nextInt();
    }

    public void getName(){
        System.out.println("Enter a Name : ");
        name = sc.next();
    }

    public void DisplayData(){
        System.out.println("The Salary is : "+ salary);
        System.out.println("The Name is "+ name);
    }
    public void SetName(){
        System.out.println("Enter a Name to change : ");
        ChangeName = sc.next();
        name=ChangeName;
    }


}
public class Practiceset8_1 {
    public static void main(String[] args) {

        Employe obj = new Employe();
        obj.getSalary();
        obj.getName();
        obj.DisplayData();
        obj.SetName();
        obj.DisplayData();
    }
}
