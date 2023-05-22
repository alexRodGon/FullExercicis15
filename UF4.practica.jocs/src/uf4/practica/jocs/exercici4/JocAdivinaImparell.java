package uf4.practica.jocs.exercici4;

/**
 *
 * @author Alex
 */
public class JocAdivinaImparell extends JocAdivinaNumero {

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
}
