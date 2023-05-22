package uf4.practica.jocs.exercici4;

/**
 *
 * @author Alex
 */
public abstract class Joc {
    
    private int vides;
    private final int videsInicials;
    private static int record = 0;
    
    /**
     * Constructor de la classe Joc que permet crear un nou joc amb el nombre 
     * de vides especificat.
     * @param vides El nombre de vides inicials del jugador.
     */
    public Joc(int vides) {
        this.vides = vides;
        this.videsInicials = vides;
    }
    
    /**
     * Mostra el nombre de vides que té actualment el jugador.
     */
    public void mostraVidesRestants() {
        System.out.println("Vides restants: " + vides);
    }
    
    /**
     * Resta una vida al jugador actual i comprova si s'han esgotat totes les vides.
     * @return Retorna "false" si les vides del jugador s'han esgotat, 
     * "true" si encara en té.
     */
    public boolean treureVida() {
        this.vides--;
        if (this.vides == 0) {
            System.out.println("Joc acabat");
            return false;
        } else {
            return true;
        }
    }
    
    /**
     * Reinicia la partida restablint el nombre de vides del jugador al valor inicial.
     */
    public void reiniciaPartida() {
        this.vides = this.videsInicials;
    }
    
    /**
     * Actualitza el rècord del joc si s'ha superat el valor màxim anterior.
     * @param joc L'objecte Joc que es vol comprovar si té un nou rècord.
     */
    public void actualitzaRecord() {
        if (vides == record) {
            System.out.println("S'ha aconseguit el rècord!");
        } else if (vides > record) {
            record = vides;
            System.out.println("S'ha batut el rècord! Nou rècord: " + record);
        }
    }
    
    public abstract void juga();
    
    
}
