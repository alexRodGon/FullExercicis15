package uf4.practica.jocs.exercici7;

import java.util.Scanner;
import uf4.practica.jocs.exercici7.jocs.interficies.Jugable;
import uf4.practica.jocs.exercici7.jocs.numeros.JocAdivinaImparell;
import uf4.practica.jocs.exercici7.jocs.numeros.JocAdivinaNumero;
import uf4.practica.jocs.exercici7.jocs.numeros.JocAdivinaParell;
/**
 *
 * @author Alex
 */
public class Aplicacio {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        boolean jugarMes = true;

        while (jugarMes) {
            Jugable joc = triaJoc();
            joc.mostraNom();
            joc.mostraInfo();
            joc.juga();

            System.out.println("Vols continuar jugant? s/n");
            String res = teclat.next();
            jugarMes = res.equalsIgnoreCase("s");
        }
    }

    public static Jugable triaJoc() {
        JocAdivinaNumero Joc = new JocAdivinaNumero(3, 8);
        JocAdivinaParell Jap = new JocAdivinaParell(3, 6);
        JocAdivinaImparell Jai = new JocAdivinaImparell(3,9);

        Jugable[] jocs = new Jugable[3];
        jocs[0] = Joc;
        jocs[1] = Jap;
        jocs[2] = Jai;

        System.out.println("Tria un joc: ");
        System.out.println("0 - Joc endevinar un numero");
        System.out.println("1 - Joc endevinar un numero parell");
        System.out.println("2 - Joc endevinar un numero imparell");

        Scanner teclat = new Scanner(System.in);
        int opcio = teclat.nextInt();
        while (opcio < 0 || opcio >= jocs.length) {
            System.out.println("Opcio invalida, torna-ho a intentar");
            opcio = teclat.nextInt();
        }
        return jocs[opcio];

    }
}
