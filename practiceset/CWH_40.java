class empl{
    private int id;
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public int getId(){
        return id;
    }

    public void setId(int i) {
        id = i;
    }
}

public class CWH_40 {
    public static void main(String[] args) {
        empl emp1 = new empl();
        emp1.setName("Aishwarya");
        System.out.println(emp1.getName());
        emp1.setId(123);
        System.out.println(emp1.getId());
    }
}
