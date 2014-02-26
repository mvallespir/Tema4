/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemples;

/**
 *
 * @author MVC
 */
public class Cicle {

    private String nom;
    private int hores;

    public Cicle(String nom, int hores) {
        this.nom = nom;
        this.hores = hores;
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
        return "Cicle{" + "nom=" + nom + ", hores=" + hores + '}';
    }
}
