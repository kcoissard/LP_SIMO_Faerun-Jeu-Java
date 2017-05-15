package test;

import data.ChefNain;
import data.Guerrier;
import data.LogAttaque;
import data.Nain;
import utilitaires.GuerrierUtilitaire;

/**
 *
 * Tests sur l'étape 1 :
 * - Création de guerriers
 * - Attaque entre deux guerriers
 * 
 */
public class Etape1Test {
    
    
    public static void main(String[] args) {
     
        
        // Création des Guerriers
        Guerrier G1 = new ChefNain();
        Guerrier G2 = new Nain();
       
        // G1 attaque G2
        LogAttaque logAttaque = G1.attaquer(G2);
        
        // Affichage du Log d'attaque
        GuerrierUtilitaire.printlnAttaque(logAttaque);
        
    }
}
