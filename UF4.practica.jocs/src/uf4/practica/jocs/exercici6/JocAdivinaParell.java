package uf4.practica.jocs.exercici6;

/**
 *
 * @author Alex
 */
public class JocAdivinaParell extends JocAdivinaNumero implements Jugable {

    public JocAdivinaParell(int vides, int numeroSecret) {
        super(vides, numeroSecret);
    }

    @Override
    public boolean validaNumero(int intent) {
        if (intent % 2 == 0) {
            return true;
        } else {
            System.out.println("Error: el número ha de ser parell.");
            return false;
        }
    }

    @Override
    public void mostraNom() {
        System.out.println("\nENDEVINA UN NOMBRE PARELL");
    }

    @Override
    public void mostraInfo() {
        System.out.println("Endevina el numero parell entre 1 i 10, tens " + vides + " vides");
    }
}
