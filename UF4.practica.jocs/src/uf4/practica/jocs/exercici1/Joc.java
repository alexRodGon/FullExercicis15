package uf4.practica.jocs.exercici1;

/**
 *
 * @author Alex
 */
public class Joc {
    
    public int vides;

    public static void main(String[] args) {
        // Crea instància classe Joc i mostra les vides
        Joc joc = new Joc(5);
        joc.mostrarVidesRestants();
        
        // Resta una vida i mostra les vides restants
        joc.vides--;
        joc.mostrarVidesRestants();
        
        // Crea una nova instància i mostra les vides de la nova instància i l'anterior
        Joc joc2 = new Joc(5);
        joc2.mostrarVidesRestants();
        joc.mostrarVidesRestants();
        
    }
    
    /**
     * Constructor que indica el nom de vides inicials del jugador
     * @param videsInicials
     */
    public Joc(int videsInicials) {
        this.vides = videsInicials;
    }    
    
    /**
     * Mètode que mostra les vides restants del jugador
     */
    public void mostrarVidesRestants(){
        System.out.println("Vides restants: " + this.vides);
    }
    
}
