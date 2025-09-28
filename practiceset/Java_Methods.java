public class Java_Methods {

    static int Cube(int num){
        return  num*num*num;

    }
    public static void main(String[] args) {
    int num = 5;
    int result = Cube(num);

        System.out.println("cube of "+ num + " is " + result);
    }
}
