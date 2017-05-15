package data;

/**
 * Classe représentant un Nain
 */
public class Nain extends Guerrier { 

    @Override
    protected int subirDegats(int degats) {
        return super.subirDegats(degats/2); 
    }
  
}
