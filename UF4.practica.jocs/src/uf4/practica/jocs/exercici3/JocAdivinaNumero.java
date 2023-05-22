package uf4.practica.jocs.exercici3;

/**
 *
 * @author Alex
 */
import java.util.Scanner;
import static uf4.practica.jocs.exercici3.Aplicacio.joc;

public class JocAdivinaNumero extends Joc {

    private int numeroSecret;

    /**
     * Constructor que inicialitza un nou joc d'adivinar un número amb
     * el nombre de vides especificat i un número secret.
     * @param vides El nombre de vides del jugador.
     * @param numeroSecret El número que s'ha d'endevinar en el joc.
     */
    public JocAdivinaNumero(int vides, int numeroSecret) {
        super(vides);
        this.numeroSecret = numeroSecret;
    }

    /**
     * Mètode que s'encarrega de gestionar el joc d'adivinar un número.
     * Primer reinicia la partida i demana un numero a l'usuari per consola.
     * Fa diverses comparacions segons el numero introduit i torna una resposta
     * diferent depenent de cada cas.
     * Finalment, si l'usuari consegueix endevinar el numero, mostra un missatge
     * indicant que l'ha encertat i actualitza el record.
     */
    @Override
    public void juga() {
        reiniciaPartida();
        System.out.println("Endevina un nombre entre 0 i 10:");
        Scanner teclat = new Scanner(System.in);
        int intent = teclat.nextInt();
        while (intent != this.numeroSecret) {
            if (!treureVida()) {
                System.out.println("Has perdut. El nombre secret era " + this.numeroSecret);
                return;
            }
            if (intent < this.numeroSecret) {
                System.out.println("El nombre secret és major. Torna-ho a intentar:");
            } else {
                System.out.println("El nombre secret és menor. Torna-ho a intentar:");
            }
            intent = teclat.nextInt();
        }
        System.out.println("Has encertat!!");
        actualitzaRecord(joc);
    }


}
