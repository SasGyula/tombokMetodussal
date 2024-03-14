package tombosfeltoltes;

import java.util.Random;

public class TombosFeltoltes {
    static Random rnd = new Random();
    public static void main(String[] args) {
        int[] tombkiiras = tombfeltoltes(10);
        tombKiiras(tombkiiras);
        primE(tombkiiras);
    }
    private static int[] tombfeltoltes(int DB){
        int tomb[] = new int[DB];
        for (int i = 0; i < DB; i++) {
            tomb[i] = rnd.nextInt(100);
        }        
        return tomb;
    }
    private static void tombKiiras(int[] tomb){
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i]+" ");
        }
    }
    private static void primE(int [] tomb){
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
    }
}
