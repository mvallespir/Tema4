/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemples;

import Institut.Modul;
import java.util.ArrayList;

/**
 *
 * @author MVC
 */
public class ProvesArrayList {

    public static ArrayList<Modul> llistaModul;

    public static void main(String[] args) {

        llistaModul = new ArrayList<>();
        ProvesArrayList p = new ProvesArrayList();
        p.proves();

    }

    public void proves() {
        
        Modul programacio = new Modul("Programació", 7);
        Modul entorns = new Modul("Entorns de Desenvolupament", 3);
        Modul baseDeDades = new Modul("Base de Dades", 8);
        Modul llenguatges = new Modul("Llenguatges de Marques", 5);
        
        llistaModul.add(programacio);
        llistaModul.add(entorns);
        llistaModul.add(baseDeDades);
        llistaModul.add(llenguatges);
        
        mostraLlista();
        
        System.out.println("");
        System.out.println(llistaModul.get(2).toString());
        System.out.println("");
        
        llistaModul.remove(2);
        
        mostraLlistaIndex();
        
        Modul nou = new Modul("Programacio de Sokets", 3);
        llistaModul.add(1, nou);
          
        System.out.println("");
        mostraLlistaIndex();
        
        llistaModul.remove(nou);
        
        System.out.println("");
        mostraLlistaIndex();
        
        Modul altre = new Modul("Programacio Android", 4);
        llistaModul.set(1, altre);
        
        System.out.println("");
        mostraLlistaIndex();
        
    }

    public void mostraLlistaIndex() {

        for (int i = 0; i < llistaModul.size(); i++) {

            System.out.println(llistaModul.get(i).toString() + " Pos: " + i);

        }

    }

    public void mostraLlista() {

        for (Modul m : llistaModul) {

            System.out.println(m.toString());

        }

    }
}
