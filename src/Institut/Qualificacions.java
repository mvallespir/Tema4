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
public class Qualificacions {

    private Alumne alumne;
    private Modul modul;
    private ArrayList<Examen> llistaExamens;

    public Qualificacions(Alumne alumne, Modul modul) {
        this.alumne = alumne;
        this.modul = modul;
        this.llistaExamens = new ArrayList<>();
    }

    public void afegirExamen(Examen examen) {
        llistaExamens.add(examen);
    }

    public void editarExame(Examen examen) {

        for (int i = 0; i < llistaExamens.size(); i++) {

            if (llistaExamens.get(i).getTitolExame().equals(examen.getTitolExame())) {
                llistaExamens.get(1).editarExamen(examen.getNotaExame());
            }

        }
    }

    public int calcularNotaFinal() {

        if (llistaExamens.size() != 0) {
            double sumatoriNotes = 0;

            for (int i = 0; i < llistaExamens.size(); i++) {

                sumatoriNotes = sumatoriNotes + llistaExamens.get(i).getNotaExame();

            }

            return (int) sumatoriNotes / llistaExamens.size();
            
        } else {
            
            return 0;
            
        }
    }

    @Override
    public String toString() {
        return alumne.getNom() + " " + alumne.getLlinatges() + ", nota final de " + modul.getNom() + " => " + calcularNotaFinal() + '.';
    }
}
