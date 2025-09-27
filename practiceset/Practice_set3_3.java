public class Practice_set3_3 {
    public static void main(String[] args) {
        String name = "Aishuu you are  a good   girl";
          int doubleSpaces = 0;
          int tripleSpaces = 0;

          for(int i = 0; i<name.length() - 1; i++){
              if(name.substring(i,i+2).equals("  ")){
                  doubleSpaces++;
              }
          }

        for(int i = 0; i<name.length() - 2; i++){
            if(name.substring(i,i+3).equals("   ")){
                tripleSpaces++;
            }
        }
        System.out.println("DoubleSpaces Found : " + doubleSpaces);
        System.out.println("TripleSpaces Found : " + tripleSpaces);
    }
}
