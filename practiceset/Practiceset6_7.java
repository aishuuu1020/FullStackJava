import java.util.Arrays;

//public class Practiceset6_7 {
//    public static void main(String[] args) {
//        int[] My_Array = {9,8,3,4,5};
//
//        Arrays.sort(My_Array);
//
//        System.out.println("Sorted Array : ");
//        for(int num : My_Array){
//            System.out.print(num + " ");
//        }
//    }
//}


public class Practiceset6_7{
    public static void main(String[] args) {
        int[] My_Array = {11,7,8,9};
        for(int i =0;i <My_Array.length-1; i++){
            if(My_Array[i]>My_Array[i+1]){
                int temp= My_Array[i];
                My_Array[i]=My_Array[i+1];
                My_Array[i+1]=temp;
            }
        }
        for (int i=0; i<My_Array.length; i++){
            System.out.print(My_Array[i]);
            System.out.print(" ");
        }

    }
}
