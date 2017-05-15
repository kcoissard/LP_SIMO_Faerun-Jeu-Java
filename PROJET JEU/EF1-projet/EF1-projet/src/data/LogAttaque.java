/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 * Classe permettant de représenter une attaque en deux guerriers : l'attaquant et la "victime" le guerrier qui défend
 * 
 * 
 * @author fbm
 */
public class LogAttaque {
    private final  Guerrier attaquant;
    private final  int degatsPotentiels;
    private final  int degatsReels;
    private final  Guerrier victime;

    public LogAttaque(Guerrier attaquant, int degatsPotentiels, int degatsReels, Guerrier victime) {
        this.attaquant = attaquant;
        this.degatsPotentiels = degatsPotentiels;
        this.degatsReels = degatsReels;
        this.victime = victime;
    }

    /**
     * @return the attaquant
     */
    public Guerrier getAttaquant() {
        return attaquant;
    }

    /**
     * @return the degatsPotentiels
     */
    public int getDegatsPotentiels() {
        return degatsPotentiels;
    }

    /**
     * @return the degatsReels
     */
    public int getDegatsReels() {
        return degatsReels;
    }

    /**
     * @return the victime
     */
    public Guerrier getVictime() {
        return victime;
    }

 
    
    
}
