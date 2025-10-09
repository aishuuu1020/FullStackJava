package practiceset;

import java.util.regex.Pattern;

public class Prcticeset7_2 {
    static void patterrn(int n){
        for(int i=0; i<=n; i++){
            for(int j=i; j<=n; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        System.out.print("\n");
    }

    static void patterrn2(int n){
        for(int i=0; i<=n; i++){
            for(int j=1; j<=i+1; j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }

    }



    public static void main(String[] args) {
        patterrn(4);
        patterrn2(4);
    }
}
