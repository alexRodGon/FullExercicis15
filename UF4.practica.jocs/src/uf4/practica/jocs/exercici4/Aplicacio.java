package uf4.practica.jocs.exercici4;


/**
 *
 * @author Alex
 */
public class Aplicacio {
    

    public static void main(String[] args) {
        
        JocAdivinaNumero Joc = new JocAdivinaNumero(3,5);
        Joc.juga();
        
        JocAdivinaParell Jap = new JocAdivinaParell(3,8);
        Jap.juga();
        
        JocAdivinaImparell Jai = new JocAdivinaImparell(3,7);
        Jai.juga();
        

    }
}
