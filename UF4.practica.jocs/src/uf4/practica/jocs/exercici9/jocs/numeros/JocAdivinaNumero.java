package uf4.practica.jocs.exercici9.jocs.numeros;

/**
 *
 * @author Alex
 */
import java.util.Random;
import java.util.Scanner;
import uf4.practica.jocs.exercici9.jocs.Joc;
import uf4.practica.jocs.exercici9.jocs.interficies.Jugable;

public class JocAdivinaNumero extends Joc implements Jugable {


    int numeroSecret;
    Random random;

    /**
     * Constructor que inicialitza un nou joc d'adivinar un número amb el nombre
     * de vides especificat i un número secret.
     *
     * @param vides El nombre de vides del jugador.
     * @param numeroSecret El número que s'ha d'endevinar en el joc.
     */
    public JocAdivinaNumero(int vides) {
        super(vides);
        random = new Random(System.currentTimeMillis());
        numeroSecret = random.nextInt(11);
    }

    /**
     * Mètode que s'encarrega de gestionar el joc d'adivinar un número. Primer
     * reinicia la partida i demana un numero a l'usuari per consola. Fa
     * diverses comparacions segons el numero introduit i torna una resposta
     * diferent depenent de cada cas. Finalment, si l'usuari consegueix
     * endevinar el numero, mostra un missatge indicant que l'ha encertat i
     * actualitza el record.
     */
    @Override
    public void juga() {
        reiniciaPartida();
        Scanner teclat = new Scanner(System.in);
        int intent = teclat.nextInt();
        boolean numOK = validaNumero(intent);

        while (!numOK) {
            System.out.println("Numero invalid, torna-ho a intentar");
            intent = teclat.nextInt();
            numOK = validaNumero(intent);
        }

        for (int i = 0; i < vides; i++) {
            if (intent == numeroSecret) {
                System.out.println("Has encertat!");
                actualitzaRecord();
                return;
            } else {
                System.out.println("Has fallat");
                if (!treureVida()) {
                    return;
                }
                mostraVidesRestants();

            }

            if (intent > this.numeroSecret) {
                System.out.println("El nombre secret és menor. Torna-ho a intentar:");
            } else {
                System.out.println("El nombre secret és major. Torna-ho a intentar:");
            }
            System.out.println("Torna-ho a provar");
            intent = teclat.nextInt();
            numOK = validaNumero(intent);

            while (!numOK) {
                System.out.println("Numero invalid, torna-ho a intentar");
                intent = teclat.nextInt();
                numOK = validaNumero(intent);
            }

        }

        System.out.println("Has perdut");

    }

    public boolean validaNumero(int intent) {

        return intent >= 1 && intent <= 10;
    }
    
    @Override
    public void mostraNom(){
        System.out.println("ENDEVINA UN NUMERO");
    }
    
    @Override
    public void mostraInfo(){
        System.out.println("Endevina el numero entre 1 i 10, tens " + vides + " vides");
    }
    
    @Override
    public void reiniciaPartida(){
        super.reiniciaPartida();
        numeroSecret = random.nextInt(11);
    }

}
