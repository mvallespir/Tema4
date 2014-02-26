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
public class Alumne {

    private String nom;
    private String llinatges;
    private int edat;
    private int numExpedient;
    private CicleArrayList cicle;
    private ArrayList<Modul> llitatModulsMatriculats;
    private ArrayList<Qualificacions> llitatQualificacions;

    public Alumne(String nom, String llinatges, int edat, int numExpedient) {
        this.nom = nom;
        this.llinatges = llinatges;
        this.edat = edat;
        this.numExpedient = numExpedient;
        this.llitatModulsMatriculats = new ArrayList<>();
        this.llitatQualificacions = new ArrayList<>();
    }

    public boolean afegirQualificacio(Qualificacions qualificacio) {

        if (llitatQualificacions.size() < llitatModulsMatriculats.size()) {
            llitatQualificacions.add(qualificacio);
            return true;
        }
        return false;

    }

    public void tornaLlistatQualifiacions() {

        for (Qualificacions q : llitatQualificacions) {
            System.out.println(q.toString());
        }
    }


    public boolean matricularModul(Modul modul) {

        if (llitatModulsMatriculats.size() < cicle.getMaximModuls()) {
            llitatModulsMatriculats.add(modul);
            return true;
        }
        return false;
    }

    public Modul tornaModul(String nomModul) {

        for (Modul m : llitatModulsMatriculats) {
            if (m.getNom().equals(nomModul)) {
                return m;
            }
        }
        return null;

    }

    public void tornallitatModulsMatriculats() {

        for (Modul m : llitatModulsMatriculats) {
            m.info();
        }

    }

    public boolean eliminarModul(String nomModul) {

        for (int i = 0; i < llitatModulsMatriculats.size(); i++) {

            if (llitatModulsMatriculats.get(i).getNom().equals(nomModul)) {
                llitatModulsMatriculats.remove(i);
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

    public String getLlinatges() {
        return llinatges;
    }

    public void setLlinatges(String llinatges) {
        this.llinatges = llinatges;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public int getNumExpedient() {
        return numExpedient;
    }

    public void setNumExpedient(int numExpedient) {
        this.numExpedient = numExpedient;
    }

    public CicleArrayList getCicle() {
        return cicle;
    }

    public void setCicle(CicleArrayList cicle) {
        this.cicle = cicle;
    }

    @Override
    public String toString() {
        return "Alumne: " + nom + ", " + llinatges + ". Edat: " + edat + ". Numero Expedient: " + numExpedient + ". Cicle:" + cicle + '.';
    }
}
