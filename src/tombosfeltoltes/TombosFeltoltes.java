package tombosfeltoltes;

import java.util.Random;

public class TombosFeltoltes {
    static Random rnd = new Random();
    public static void main(String[] args) {
        primszamok();
    }

    private static void primszamok() {
        int[] tombkiiras = tombfeltoltes(3);
        tombKiiras(tombkiiras);
        primekE(tombkiiras);
    }
    private static void primekE(int[] tombkiiras) {
        System.out.println(primEOsszes(tombkiiras)? "Az összes prím":"Nem az összes prím");
    }
    private static int[] tombfeltoltes(int DB){
        int tomb[] = new int[DB];
        for (int i = 0; i < DB; i++) {
            tomb[i] = rnd.nextInt(100);
        }
//        tomb[0] = 2;
//        tomb[1] = 3;
//        tomb[2] = 5;
        return tomb;
    }
    private static void tombKiiras(int[] tomb){
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i]+" ");
        }
    }
    private static int primE(int [] tomb){
        int db = 0;
        for (int i = 0; i < tomb.length; i++) {
            boolean primE;
            if(tomb[i] < 2){
                primE = false;
            }else{
                int j = 2;
                while(j <= Math.sqrt(tomb[i]) && tomb[i] % j !=0){
                    j++;
                }
                primE = j>Math.sqrt(tomb[i]);
            }
            if(primE){
                db++;
            }
            }
        if(db>0){
            System.out.println("\n"+db+ " darab prím van benne!");
        }else{
            System.out.println("\nNincs benne prím!");
        }
        return db;
    }
    private static boolean primEOsszes(int[] tomb){
        int db = tomb.length;
        int primekSzama = primE(tomb);
        return db == primekSzama;
    }
}
