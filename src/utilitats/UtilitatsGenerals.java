/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitats;

/**
 *
 * @author MVC
 */
public class UtilitatsGenerals {

    public static int nombreAleatori(int max, int min) {

        return min + (int) (Math.random() * ((max - min) + 1));

    }
    
    public static void mostrar(String cadena){
        System.out.println(cadena);
    }
    
}
