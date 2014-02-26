/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Institut;

/**
 *
 * @author MVC
 */
public class Modul {

    private String Nom;
    private int Hores;

    public Modul(String Nom, int Hores) {
        this.Nom = Nom;
        this.Hores = Hores;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public int getHores() {
        return Hores;
    }

    public void setHores(int Hores) {
        this.Hores = Hores;
    }

    public void info() {
        System.out.println(getNom() + ": " + getHores() + " hores.");
    }

    public void provaVarags(String... noms) {
        for (int i = 0; i <= noms.length - 1; i++) {
            System.out.print(noms[i] + " ");
        }
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Modul{" + "Nom=" + Nom + ", Hores=" + Hores + '}';
    }
}
