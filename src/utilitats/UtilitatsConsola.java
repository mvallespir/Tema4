package utilitats;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Creau el paquet utilitats. Dins el paquet creau la classe UtilitatsConsola
 * amb les següents característiques: No tendrà main. Tendra un mètode
 * llegirCadena que tornarà un String. Tendrà un pàràmetre també de tipus String
 * que serà el text que es mostrarà a l'usuari per que sàpiga quina dada es
 * demana. Tendra un mètode llegirSencer que tornarà un int. Tendrà un pàràmetre
 * de tipus String que serà el text que es mostrarà a l'usuari per que sàpiga
 * quina dada es demana. Tendra un mètode llegirDouble que tornarà un double.
 * Basau-vos en el mètode anterior.
 *
 * A partir d'ara utilitzau aquesta classe quan necessiteu llegir dades de
 * teclat. La manera de fer-ho serà creant un objecte d'aquesta classe:
 * UtilitatsConsola utilitats=new UtilitatsConsola(); En haver d'utilitzar un
 * dels seus mètodes cridau-lo, per exemple int
 * quantitatNotes=utilitats.llegirSencer("Nombre de notes: ");
 *
 * @author MVC
 */
public class UtilitatsConsola {

    public static int gestionarMenu(String pregunta, String titol, String[] opcions) throws IOException {
        String curLine = ""; // Line read from standard in
        int a = 0;
        boolean correcte;

        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(converter);

        System.out.println(titol);

        for (int i = 0; i <= opcions.length - 1; i++) {
            System.out.println(i + ".- " + opcions[i] + ".");
        }
        System.out.println("");

        do {
            try {

                System.out.print(pregunta + ": ");
                curLine = in.readLine();
                a = Integer.parseInt(curLine);

                if (a >= 0 && a <= opcions.length - 1) {
                    correcte = true;
                } else {
                    correcte = false;
                    System.out
                            .println("El sencer no es correcte a de ser entre 1 i 5!!");
                }

            } catch (NumberFormatException n) { // Si no pot transformar la
                // cadena a int
                System.out.println("No ha introduit un sencer");
                correcte = false;
            }
        } while (!correcte); // Llegir� el teclat fins que entrem un int

        return a;
    }

    public static String llegirCadena(String prompt) {
        boolean correcte = false;

        String cadena = "";

        //L'objecte teclat representa l'entrada de dades.
        Scanner teclat = new Scanner(System.in);

        do {
            System.out.print(prompt + ": ");
            try {
                cadena = teclat.nextLine();
                correcte = true;

            } catch (InputMismatchException e) {
                System.err.println("Cadena incorrecte.");
                teclat.next();
            }
        } while (correcte == false);
        return cadena;
    }

    public static int llegirSencer(String prompt) {
        boolean correcte = false;

        int cadena = 0;

        //L'objecte teclat representa l'entrada de dades.
        Scanner teclat = new Scanner(System.in);

        do {
            System.out.print(prompt + ": ");
            try {
                cadena = Integer.parseInt(teclat.next());
                correcte = true;

            } catch (Exception e) {
                //teclat.next();
            }
        } while (correcte == false);
        return cadena;
    }

    public double llegirDouble(String prompt) {
        boolean correcte = false;

        double cadena = 0;

        //L'objecte teclat representa l'entrada de dades.
        Scanner teclat = new Scanner(System.in);

        do {
            System.out.print(prompt + ": ");
            try {
                cadena = Double.parseDouble(teclat.next());
                correcte = true;

            } catch (Exception e) {
                //teclat.next();
            }
        } while (correcte == false);
        return cadena;
    }
}
