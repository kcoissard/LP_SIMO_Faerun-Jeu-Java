package data;

/**
 * Classe représentant un Chef Nain
 */
public class ChefNain extends Nain {
    
    @Override
    protected int subirDegats(int degats) {
        return super.subirDegats(degats/2); 
    }
    
}
