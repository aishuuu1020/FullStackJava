class MyEmployee{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }

    public void setId(int i ){
        this.id = i;
    }
}

public class CWH_40_1 {
    public static void main(String[] args) {
        MyEmployee Aishuu = new MyEmployee();

        Aishuu.setName("Aishwarya");
        System.out.println(Aishuu.getName());

        Aishuu.setId(234);
        System.out.println(Aishuu.getId());
    }
}
