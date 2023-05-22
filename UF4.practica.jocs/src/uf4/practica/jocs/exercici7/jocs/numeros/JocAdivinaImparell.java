package uf4.practica.jocs.exercici7.jocs.numeros;

import uf4.practica.jocs.exercici7.jocs.interficies.Jugable;


/**
 *
 * @author Alex
 */
public class JocAdivinaImparell extends JocAdivinaNumero implements Jugable {

    public JocAdivinaImparell(int vides, int numeroSecret) {
        super(vides, numeroSecret);
    }

    @Override
    public boolean validaNumero(int intent) {
        if (intent % 2 != 0) {
            return true;
        } else {
            System.out.println("Error: el número ha de ser imparell.");
            juga();
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
}
