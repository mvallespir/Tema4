/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Institut;

import java.util.ArrayList;

/**
 *
 * @author MVC
 */
public class CicleArrayList {

    private String nom;
    private int hores;
    private ArrayList<Modul> llistaModuls;
    private int maximModuls;

    public CicleArrayList(String nom, int hores, int maximModuls) {
        this.nom = nom;
        this.hores = hores;
        this.llistaModuls = new ArrayList<>();
        this.maximModuls = maximModuls;
    }

    public boolean afegirModul(Modul modul) {

        if (llistaModuls.size() < maximModuls) {
            llistaModuls.add(modul);
            return true;
        }
        return false;
    }

    public Modul tornaModul(String nomModul) {

        for (Modul m : llistaModuls) {
            if (m.getNom().equals(nomModul)) {
                return m;
            }
        }
        return null;

    }

    public void tornaLlistaModuls() {

        for (Modul m : llistaModuls) {
            m.info();
        }

    }

    public boolean eliminarModul(String nomModul) {

        for (int i = 0; i < llistaModuls.size(); i++) {

            if (llistaModuls.get(i).getNom().equals(nomModul)) {
                llistaModuls.remove(i);
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
    
    public int getMaximModuls() {
        return maximModuls;
    }

    @Override
    public String toString() {
        return "Cicle{" + "nom=" + nom + ", hores=" + hores + '}';
    }
}
