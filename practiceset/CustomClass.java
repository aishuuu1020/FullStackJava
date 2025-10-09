import java.util.Scanner;

class Employee{
    public int id;
    public String name;
    Scanner sc = new Scanner(System.in);

    public void getdata(){
        System.out.println("Enter a id: ");
        id = sc.nextInt();
        System.out.println("Enter a name: ");
        name = sc.next();
    }
    public void putdata(){
        System.out.println("The employee id is: "+ id );
        System.out.println("The employee name : "+ name);
    }
}
public class CustomClass {
    public static void main(String[] args){
        Employee obj = new Employee();
        obj.getdata();
        obj.putdata();
    }
}