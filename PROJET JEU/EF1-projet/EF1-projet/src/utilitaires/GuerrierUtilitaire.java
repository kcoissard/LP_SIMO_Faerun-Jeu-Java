package utilitaires;

import data.Guerrier;
import data.LogAttaque;
import java.util.List;

/**
 *
 * @author fbm
 */
public class GuerrierUtilitaire {
    
    //////////////////////////////////
    // METHODES D'AFFICHAGE
    public static void printGuerrier(Guerrier unite) {
        System.out.print(unite.getClass().getSimpleName() + "_" + "[PV " + unite.getPV() + "]");
    }

    public static void printGuerrierWithSpace(Guerrier unite) {
        System.out.print("      ");
        printGuerrier(unite);
    }

    public static void printlnGuerrier(Guerrier unite) {
        printGuerrier(unite);
        System.out.println();
    }

    public static void printlnUniteWithSpace(Guerrier unite) {
        printGuerrierWithSpace(unite);
        System.out.println();
    }

    public static void printlnAttaque(LogAttaque logAttaque) {
        System.out.print("      ATTAQUE : ");
        printGuerrier(logAttaque.getAttaquant());
        System.out.print(" tape (degats potentiels " + logAttaque.getDegatsPotentiels() + " => degats réels " + logAttaque.getDegatsReels() + ") ");
        printlnGuerrier(logAttaque.getVictime());
    }
    
    public static void printlnGuerrier(List<Guerrier> guerriers) {
        for (Guerrier guerrier : guerriers) {
            printlnGuerrier(guerrier);
        }
    }

    
}
