/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Institut;

/**
 *
 * @author MVC
 */
public class Examen {
    
    private String titolExamen;
    private double notaExamen;

    public Examen(String titolExamen, double notaExamen) {
        this.titolExamen = titolExamen;
        this.notaExamen = notaExamen;
    }
    
    public void editarExamen(double notaExamen){
        
        this.notaExamen = notaExamen;
        
    }
    
    public double getNotaExame(){
        return notaExamen;
    }
    
    public String getTitolExame(){
        return titolExamen;
    }

    @Override
    public String toString() {
        return "Examen: " + titolExamen + ", Nota =>" + notaExamen + '.';
    }
    
    
}
