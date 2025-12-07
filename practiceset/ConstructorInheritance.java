class Base1 {
    Base1() {
        System.out.println("Mai ek constructor hoon");
    }

    Base1(int x) {
        System.out.println("I am a overloaded constructor with value of a" + x);
    }
}
class Derived1 extends Base1 {
    Derived1() {
        System.out.println("I am a constructor of a derived class");
    }

    Derived1(int x, int y) {
        super(x);
        System.out.println("I am a overloaded constructor of a derived class with value of y as " + y);
    }
}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived Constructor : ");
    }

    ChildOfDerived(int x, int y, int z){
        super(z,y);
        System.out.println("I am a child of derived Constructor : ");
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
        Base1 b = new Base1(9);
        Derived1 d = new Derived1(2,7);

        ChildOfDerived cd= new ChildOfDerived();

    }
}
