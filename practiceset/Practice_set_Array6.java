public class Practice_set_Array6 {
    public static void main(String[] args) {

        int[] marks = {10,20,30,40,50};
        int[] arr;
        arr = new int[3];

        //used for loop


        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        arr[0]=15;
        arr[1]=34;
        arr[2]=19;

        //printing the array using for each loop
        for(int elements : arr){
            System.out.println(elements);
        }

        //Reversing the array
        for(int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }

        //multidimentional array


        int [][] myArray = new int[2][3];
        myArray[0][0]=101;
        myArray[0][1]=102;
        myArray[0][2]=103;

        myArray[1][0]=104;
        myArray[1][1]=105;
        myArray[1][2]=106;

      for(int i=0; i<myArray.length; i++){
          for(int j=0; j<myArray[i].length; j++){
              System.out.print(myArray[i][j]);
              System.out.print(" ");
          }
          System.out.print("\n");
      }
    }
}
