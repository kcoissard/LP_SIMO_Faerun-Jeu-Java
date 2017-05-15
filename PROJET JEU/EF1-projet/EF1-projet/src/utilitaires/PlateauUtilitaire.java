package utilitaires;

import java.util.Random;

/**
 *
 * @author fbm
 */
public class PlateauUtilitaire {
    
    // https://docs.oracle.com/javase/7/docs/api/java/util/Random.html
    private static Random random = new Random();
    
    /**
     * lancé d'un dé trois faces
     * @return : entier entre 1 et 3
     */
    public static int De3() {
        return random.nextInt(3)+1;
    }
    
    /**
     * nombreLances d'un dé 3 faces
     * @param nombreLances
     * @return
     */
    public static int De3(int nombreLances) {
        int somme = 0;
        for (int i = 0; i < nombreLances; i++) {
            somme = somme + De3();
        }
        
        return somme;
    }
    
}
