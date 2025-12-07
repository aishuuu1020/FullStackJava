
class  employ{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n ){
        name = n;
    }
}



class CellPhone{

    public void ring(){
        System.out.println("Ringingbbbbbbb....");
    }
    public void vibrate(){
        System.out.println("Vibrating.....");
    }

    public void CallFriend(){
        System.out.println("Calling Aishuuu ");
    }
}


class square {
    int side;
    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }
}


class tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }

    public void run(){
        System.out.println("Running from the enemy");
    }

    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

public class CWH_39 {
    public static void main(String[] args) {
    employ ashhh = new employ();
    ashhh.setName("Aishwarya");
    ashhh.salary = 233;
        System.out.println(ashhh.getName());
        System.out.println(ashhh.getSalary());

//        CellPhone asus = new CellPhone();
//        asus.CallFriend();
//        asus.vibrate();
//        asus.ring();


//        square sq= new square();
//        sq.side=3;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());

//        tommy player1 = new tommy();
//        player1.fire();
//        player1.run();
//        player1.hit();


    }
}
