package uf4.practica.jocs.exercici2;

/**
 *
 * @author Alex
 */
public class Aplicacio {

    
    public static void main(String[] args) {
        Joc joc = new Joc(5);
        joc.treureVida();
        joc.mostraVidesRestants();
        joc.reiniciaPartida();
        joc.mostraVidesRestants();
        Joc.actualitzaRecord(joc);

        Joc joc2 = new Joc(5);
        Joc.actualitzaRecord(joc2);
        
    }
}
