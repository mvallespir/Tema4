/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemples;

import Institut.Modul;

/**
 *
 * @author MVC
 */
public class CicleArray {

    private String nom;
    private int hores;
    private Modul[] moduls;
    private int numModuls;

    public CicleArray(String nom, int hores, int quantModuls) {
        setNom(nom);
        this.hores = hores;
        moduls = new Modul[quantModuls];
        numModuls = 0;
    }

    public boolean afegirModul(Modul nouModul) {

        if (nouModul == null) {
            return false;
        } else {

            if (numModuls < moduls.length) {
                moduls[numModuls] = nouModul;
                numModuls++;
                return true;
            } else {
                return false;
            }
        }

    }

    public Modul tornaModul(String nomModul) {

        for (int i = 0; i < numModuls; i++) {
            if (moduls[i].getNom().equals(nomModul)) {
                return moduls[i];
            }
        }
        return null;

    }

    public boolean eliminarModul(String nomModul) {

                
        for (int i = 0; i < numModuls; i++) {

            if (moduls[i].getNom().equals(nomModul)) {
                moduls[i] = null;

                for (int a = i; i < numModuls - 1; i++) {

                    moduls[i] = moduls[a + 1];
                    moduls[a + 1] = null;
                }

                numModuls--;

                return true;
            }
        }
        return false;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHores() {
        return hores;
    }

    public void setHores(int hores) {
        this.hores = hores;
    }

    @Override
    public String toString() {
        return "CicleArray{" + "nom=" + nom + ", hores=" + hores + ", numModuls=" + numModuls + '}';
    }
}
