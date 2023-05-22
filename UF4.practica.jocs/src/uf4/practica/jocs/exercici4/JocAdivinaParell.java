package uf4.practica.jocs.exercici4;

/**
 *
 * @author Alex
 */
public class JocAdivinaParell extends JocAdivinaNumero {

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
}
