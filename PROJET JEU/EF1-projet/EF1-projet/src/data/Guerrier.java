package data;

import utilitaires.PlateauUtilitaire;

/**
 * Classe représentant un Guerrier
 */
public abstract class Guerrier {
    
    // CONSTANTES
    private static final int FORCE = 10;
    private static final int PV_MAX = 100;
      
    // DATA
    private int PV;

    public Guerrier() {
        setPV(PV_MAX);
    }

    /**
     * @return the force
     */
    public int getForce() {
        return FORCE;
    }
    
    /**
     * @return the PV
     */
    public int getPV() {
        return PV;
    }

    /**
     * @param PV the PV to set
     */
    public void setPV(int PV) {
        this.PV = PV;
    }
    
    
    /**
     * Le guerrier courant (this) attaque le guerrier en paramètre (la victime).
     * 
     * @param victime
     * @return 
     */
    public LogAttaque attaquer(Guerrier victime) {
        
        // 1. calcul des degats
        int degatsPotentiels = PlateauUtilitaire.De3(getForce());
        
        // 2. subir les dégats à la victime
        int degatsReels = victime.subirDegats(degatsPotentiels);
        
        // 3. Création du log d'attaque pour futur affichage
        LogAttaque logAttaque = new LogAttaque(this, degatsPotentiels, degatsReels, victime);
        
        return logAttaque;     
    }

    /**
     * Le guerrier subit des dégats.
     * 
     * @param degats
     * @return 
     */
    protected int subirDegats(int degats) {
        setPV(getPV() - degats);
        return degats;
    }
    
    
    
}
