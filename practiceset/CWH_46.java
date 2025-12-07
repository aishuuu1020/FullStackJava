
class Base2{

        Base2(){
            System.out.println("I am a constructor");
        }
    public int x;

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
}

class Derived2 extends Base2{

    Derived2(){
        System.out.println("I am a derived class constructor");
    }
    public int y;
    public int getY(){
        return y;
    }

    public void setY(){
        this.y = y;
    }
}
public class CWH_46 {
    public static void main(String[] args) {
       // Base2 b = new Base2();
        Derived2 d = new Derived2();
    }
}

