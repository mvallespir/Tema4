/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemples;

import Institut.CicleArrayList;
import Institut.Modul;

/**
 *
 * @author MVC
 */
public class Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Modul programacio = new Modul("Programacio", 7);
        Modul baseDades = new Modul("Base de Dades", 8);
        Modul entornsDev = new Modul("Entorns de Desenvolupament", 8);

        CicleArrayList daw = new CicleArrayList("Desenvolupament Aaplicacions Web", 30, 3);

        daw.afegirModul(programacio);
        daw.afegirModul(baseDades);
        daw.afegirModul(entornsDev);
        if (!daw.afegirModul(entornsDev)) {
            System.out.println("Error a la insercio de Modul");
        }

        System.out.println(daw.tornaModul("Programacio").toString());
        System.out.println(daw.tornaModul("Base de Dades").toString());
        System.out.println(daw.tornaModul("Entorns de Desenvolupament").toString());
        System.out.println();

        daw.eliminarModul("Base de Dades");

        daw.tornaLlistaModuls();



    }

    public void cicleArray() {

        Modul programacio = new Modul("Programacio", 7);
        programacio.info();
        Modul baseDades = new Modul("Base de Dades", 8);
        baseDades.info();
        Modul entornsDev = new Modul("Entorns de Desenvolupament", 8);
        entornsDev.info();

        System.out.println("\n");
        CicleArray daw = new CicleArray("Desenvolupament Aaplicacions Web", 30, 3);
        System.out.println(daw.toString());

        if (!daw.afegirModul(programacio)) {
            System.out.println("El cicle ja esta complet!!");
        } else {
            if (daw.tornaModul("Programacio") == null) {
                System.out.println("El modul sercat no existeix");
            } else {
                System.out.println(daw.tornaModul("Programacio").toString());
                System.out.println(daw.toString());
            }
        }

        if (!daw.afegirModul(baseDades)) {
            System.out.println("El cicle ja esta complet!!");
        } else {
            if (daw.tornaModul("Base de Dades") == null) {
                System.out.println("El modul sercat no existeix");
            } else {
                System.out.println(daw.tornaModul("Base de Dades").toString());
                System.out.println(daw.toString());
            }
        }

        if (!daw.afegirModul(entornsDev)) {
            System.out.println("El cicle ja esta complet!!");
        } else {
            if (daw.tornaModul("Entorns de Desenvolupament") == null) {
                System.out.println("El modul sercat no existeix");
            } else {
                System.out.println(daw.tornaModul("Entorns de Desenvolupament").toString());
                System.out.println(daw.toString());
            }
        }

        daw.eliminarModul("Base de Dades");

        if (daw.tornaModul("Base de Dades") == null) {
            System.out.println("El moduln Base de Dades no existeix");
        } else {
            System.out.println(daw.tornaModul("Base de Dades").toString());
            System.out.println(daw.toString());
        }

        if (!daw.afegirModul(baseDades)) {
            System.out.println("El cicle ja esta complet!!");
        } else {
            if (daw.tornaModul("Base de Dades") == null) {
                System.out.println("El modul sercat no existeix");
            } else {
                System.out.println(daw.tornaModul("Base de Dades").toString());
                System.out.println(daw.toString());
            }
        }
    }
}
