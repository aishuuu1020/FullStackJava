class phone{
    public void greet(){
        System.out.println("Good Morning");
    }

    public void on(){
        System.out.println("Turning on phone");
    }
}

class SmartPhone extends phone{
    public void swagat(){
        System.out.println("Swagat hai Apaka ");
    }
}

public class Dynamic_methodDispatch {
    public static void main(String[] args) {
//    phone obj = new phone();
//    SmartPhone smobj = new SmartPhone();
//    obj.name();

        phone obj = new SmartPhone();//yes it is aloud
        obj.greet();
        obj.on();
    }
}
