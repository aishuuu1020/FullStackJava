import java.util.Scanner;



   class Square{
       public int side;
       public int area;
       public int perimeter;

       Scanner sc = new Scanner(System.in);

       public void InputSide(){
           System.out.println("Enter a Square Side : ");
           side = sc.nextInt();
       }

       public void AreaOfSquare(){
           area = side*side;
           System.out.println("The Area of the Square is : "+area+"sq/m");
       }

       public void PerimeterOfSquare(){
           perimeter=4*side;
           System.out.println("The Perimeter of a Square is : "+perimeter);
       }
   }

     public class Practiceset8_3 {

    public static void main(String[] args) {
        Square obj = new Square();
        obj.InputSide();
        obj.AreaOfSquare();
        obj.PerimeterOfSquare();

    }
}
