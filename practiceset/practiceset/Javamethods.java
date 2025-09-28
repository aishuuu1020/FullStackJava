package practiceset;

public class Javamethods {
    public int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {

        Javamethods obj = new Javamethods();
        int result = obj.sum(60,20);

        System.out.println("Sum is : " + result );
    }
}
