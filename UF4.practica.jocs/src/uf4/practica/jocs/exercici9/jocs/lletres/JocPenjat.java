package uf4.practica.jocs.exercici9.jocs.lletres;

import java.util.Scanner;
import uf4.practica.jocs.exercici9.jocs.Joc;
import uf4.practica.jocs.exercici9.jocs.interficies.Jugable;

/**
 *
 * @author Alex
 */

public class JocPenjat extends Joc implements Jugable {
    private String cadenaEndevinar;
    private String cadenaActual;
    private int vides;

    public JocPenjat(int vides, String cadenaEndevinar) {
        super(vides);
        this.vides = vides;
        this.cadenaEndevinar = cadenaEndevinar;
    }

    @Override
    public void juga() {
        reiniciaPartida();
        inicialitzaCadenaActual();

        Scanner teclat = new Scanner(System.in);

        while (vides > 0) {
            System.out.println("Paraula actual: " + cadenaActual);
            System.out.print("Introdueix un caràcter: ");
            String caracters = teclat.nextLine();

            if (caracters.length() != 1) {
                System.out.println("Introdueix només un caràcter.");
                continue;
            }

            char caracter = caracters.charAt(0);

            if (cadenaEndevinar.contains(String.valueOf(caracter))) {
                actualitzaCadenaActual(caracter);

                if (cadenaActual.equals(cadenaEndevinar)) {
                    System.out.println("Has endevinat la paraula");
                    return;
                }
            } else {
                treureVida();
            }
        }

        System.out.println("Has perdut! La paraula a endevinar era: " + cadenaEndevinar);
    }
   
    
    private void inicialitzaCadenaActual() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cadenaEndevinar.length(); i++) {
            sb.append("-");
        }
        cadenaActual = sb.toString();
    }

    private void actualitzaCadenaActual(char caracter) {
        StringBuilder sb = new StringBuilder(cadenaActual);
        for (int i = 0; i < cadenaEndevinar.length(); i++) {
            if (cadenaEndevinar.charAt(i) == caracter) {
                sb.setCharAt(i, caracter);
            }
        }
        cadenaActual = sb.toString();
    }

    
    @Override
    public boolean treureVida() {
    vides--;
    if (vides == 0) {
        System.out.println("Has perdut!");
        return true;  
    } else {
        System.out.println("No forma part de la paraula. Et queden " + vides + " vides.");
        return false;  
    }
}

    @Override
    public void mostraNom() {
        System.out.println("\nJOC PENJAT");
    }

    @Override
    public void mostraInfo() {
        System.out.println("Introdueix una lletra per cada intent. "
                + "Si la lletra consta a la paraula, s'anirà revelant, "
                + "del contrari, es restaran les vides");
    }
}