package uf4.practica.jocs.exercici8.jocs.numeros;

import uf4.practica.jocs.exercici8.jocs.interficies.Jugable;

/**
 *
 * @author Alex
 */
public class JocAdivinaImparell extends JocAdivinaNumero implements Jugable {

    public JocAdivinaImparell(int vides) {
        super(vides);
        numeroSecret = random.nextInt(11);
    }

    @Override
    public boolean validaNumero(int intent) {
        if (intent % 2 != 0) {
            return true;
        } else {
            System.out.println("Error: el número ha de ser imparell.");
            return false;
        }
    }

    @Override
    public void mostraNom() {
        System.out.println("\nENDEVINA UN NUMERO IMPARELL");
    }

    @Override
    public void mostraInfo() {
        System.out.println("Endevina el numero imparell entre 1 i 10, tens " + vides + " vides");
    }

    @Override
    public void reiniciaPartida() {
        super.reiniciaPartida();
        numeroSecret = random.nextInt(6)*2 + 1;
    }
}
