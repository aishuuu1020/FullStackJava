
class Emp{
    int id;
    int salary;
    String name;

    public void printDetails(){
        System.out.println("My ID is : " + id);
        System.out.println("My name is : " + name);
        System.out.println("My Salary is : " + salary);
    }

    public int getSalary(){
        return salary;
    }


}

public class CWH_38 {
    public static void main(String[] args) {
        System.out.println("This is our custom class : ");
        Emp Aishuu = new Emp();
        Emp Chan = new Emp();

        Aishuu.id = 12;
        Aishuu.salary = 500000;
        Aishuu.name = "Aisha\n";


        Chan.id = 34;
        Chan.salary=56000;
        Chan.name = "Chan's \n";


        Aishuu.printDetails();
        Chan.printDetails();

        int salary = Chan.getSalary();
        System.out.println(salary);

    }
}
