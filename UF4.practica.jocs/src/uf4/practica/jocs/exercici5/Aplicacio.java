package uf4.practica.jocs.exercici5;



/**
 *
 * @author Alex
 */
public class Aplicacio {
    

    public static void main(String[] args) {
        
        JocAdivinaNumero Joc = new JocAdivinaNumero(3,5);
        JocAdivinaParell Jap = new JocAdivinaParell(3,8);
        JocAdivinaImparell Jai = new JocAdivinaImparell(3,7);
        
        Joc.mostraNom();
        Joc.mostraInfo();
        Joc.juga();
        
        
        Jap.mostraNom();
        Jap.mostraInfo();
        Jap.juga();
        
        
        Jai.mostraNom();
        Jai.mostraInfo();
        Jai.juga();
        

    }
}
