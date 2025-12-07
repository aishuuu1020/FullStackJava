class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 45;
        name = "Your-name-here";
    }

    public MyMainEmployee(String myName ,int myID){
        id = myID;
        name = myName;
    }
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

public class CWH_42 {
    public static void main(String[] args) {
        MyMainEmployee Aishuu = new MyMainEmployee("Aishwarya",12);

//        Aishuu.setName("Aishwarya");
//        System.out.println(Aishuu.getName());

//        Aishuu.setId(45);
//        System.out.println(Aishuu.getId());

        System.out.println(Aishuu.getName());
        System.out.println(Aishuu.getId());
    }
}
