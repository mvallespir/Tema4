/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Institut;

import java.io.IOException;
import java.util.ArrayList;
import static utilitats.UtilitatsConsola.*;

/**
 *
 * @author MVC
 */
public class Institut {

    private ArrayList<Alumne> alumnesMatriculats;
    private ArrayList<CicleArrayList> llistatCicles;

    public static void main(String[] args) throws IOException {

        Institut iesPauCasesnoves = new Institut();
        iesPauCasesnoves.alumnesMatriculats = new ArrayList<>();
        iesPauCasesnoves.llistatCicles = new ArrayList<>();

        CicleArrayList daw = new CicleArrayList("DAW", 28, 5);
        iesPauCasesnoves.llistatCicles.add(daw);

        Modul programacio = new Modul("Programació", 7);
        Modul entorns = new Modul("Entorns de Desenvolupament", 3);
        Modul baseDeDades = new Modul("Base de Dades", 8);
        Modul llenguatges = new Modul("Llenguatges de Marques", 5);
        Modul sistemes = new Modul("Sistemes informatics", 5);

        daw.afegirModul(programacio);
        daw.afegirModul(entorns);
        daw.afegirModul(baseDeDades);
        daw.afegirModul(llenguatges);
        daw.afegirModul(sistemes);

        Alumne mvc = new Alumne("Miquel", "Vallespir Castello", 21, 2626);
        iesPauCasesnoves.matricularAlumne(mvc, daw);
        mvc.matricularModul(programacio);
        mvc.matricularModul(entorns);
        mvc.matricularModul(baseDeDades);

        //iesPauCasesnoves.alumnesMatriculats.get(0).matricularModul(mvc);


        //System.out.println(daw.toString());
        //daw.tornaLlistaModuls();

        //iesPauCasesnoves.llistaAlumnesMatriculats();

        //System.out.println("\nModuls matriculats de " + mvc.getNom() + " " + mvc.getLlinatges() + ":");
        //mvc.tornallitatModulsMatriculats();

        //CREACIO DE QUALIFICACIONS I EXAMENS
        Qualificacions notesProgramacio = new Qualificacions(mvc, programacio);
        Examen examen1 = new Examen("Seudocodi", 6.6);
        Examen examen2 = new Examen("Principis Java", 8.3);
        notesProgramacio.afegirExamen(examen1);
        notesProgramacio.afegirExamen(examen2);

        //EDITAR EXAMEN
        //examen2.editarExamen(10);
        //notesProgramacio.editarExame(examen2);

        Qualificacions notesEntorns = new Qualificacions(mvc, entorns);
        notesEntorns.afegirExamen(new Examen("Proyectes", 5.6));
        notesEntorns.afegirExamen(new Examen("IDES", 8.3));

        //AFEGIR QUALIFICACIONS A ALUMNE
        mvc.afegirQualificacio(notesProgramacio);
        mvc.afegirQualificacio(notesEntorns);

        //System.out.println("\nLlistat de qualificacions de " + mvc.getNom() + " " + mvc.getLlinatges() + ":");
        //mvc.tornaLlistatQualifiacions();

        //MENU DE GESTIO DE L'INSTITUT
        System.out.println("\n");
        String[] opcions = {"Mostrar alumnes matriculats",
            "Mostrar cicles de l'institut",
            "Mostra moduls per cicle",
            "Mostra moduls per alumne",
            "Mostra qualificacions per alumne",
            "Donar d'alta nou cicle",
            "Donar d'alta nou alumne a l'institut",
            "Tancar aplicació"};
        int opcioMenu;

        do {
            opcioMenu = gestionarMenu("Tria l'opció del menu que vol executar", "\nIES Pau Casesnoves, Gestio centre", opcions);
            if (opcioMenu == 0) {
                iesPauCasesnoves.llistaAlumnesMatriculats();
            } else if (opcioMenu == 1) {
                iesPauCasesnoves.mostrarLlistaCicles();
            } else if (opcioMenu == 2) {
                iesPauCasesnoves.mostrarLlistaCicles();
                int indexCicle = llegirSencer("Tria el cicle del qual es vol consultar els moduls");
                if (indexCicle >= iesPauCasesnoves.llistatCicles.size()) {
                    System.out.println("El valor ficat esta fora de rang!!");
                } else {
                    System.out.println("");
                    iesPauCasesnoves.llistatCicles.get(indexCicle).tornaLlistaModuls();
                }

            } else if (opcioMenu == 3) {
                iesPauCasesnoves.llistaAlumnesMatriculats();
                int indexCicle = llegirSencer("Tria l'alumne del qual es vol consultar els moduls");
                if (indexCicle >= iesPauCasesnoves.alumnesMatriculats.size()) {
                    System.out.println("El valor ficat esta fora de rang!!");
                } else {
                    System.out.println("\nModuls matriculats de " + iesPauCasesnoves.alumnesMatriculats.get(indexCicle).getNom()
                            + " " + iesPauCasesnoves.alumnesMatriculats.get(indexCicle).getLlinatges() + ":");
                    iesPauCasesnoves.alumnesMatriculats.get(indexCicle).tornallitatModulsMatriculats();
                }
            } else if (opcioMenu == 4) {
                iesPauCasesnoves.llistaAlumnesMatriculats();
                int indexCicle = llegirSencer("Tria l'alumne del qual es vol consultar les qualificacions");
                if (indexCicle >= iesPauCasesnoves.alumnesMatriculats.size()) {
                    System.out.println("El valor ficat esta fora de rang!!");
                } else {
                    System.out.println("\nLlistat de qualificacions de " + iesPauCasesnoves.alumnesMatriculats.get(indexCicle).getNom() + " " + iesPauCasesnoves.alumnesMatriculats.get(indexCicle).getLlinatges() + ":");
                    iesPauCasesnoves.alumnesMatriculats.get(indexCicle).tornaLlistatQualifiacions();
                }
            } else if (opcioMenu == 5) {

                System.out.println("Dades per el nou cicle:");
                String nomCicle = llegirCadena("Introdueix nom del cicle");
                int quantModuls = llegirSencer("Introdueix la quantitat de moduls que tendra");
                int hores = llegirSencer("Introdueix les hores semanals que durara");

                CicleArrayList nou = new CicleArrayList(nomCicle, hores, quantModuls);
                iesPauCasesnoves.llistatCicles.add(nou);
                System.out.println("Cicle donat d'alta correctament!!");

            } else if (opcioMenu == 6) {
                
                System.out.println("Dades per el nou alumne:");
                String nom = llegirCadena("Introdueix nom de l'alumne");
                String llinatge = llegirCadena("Introdueix els llinatges de l'alumne");
                int edat = llegirSencer("Introdueix l'edat de l'alumne");
                int numExpedient = llegirSencer("Introdueix el numero d'expedient de l'alumne");

                Alumne nou = new Alumne(nom, llinatge, edat, numExpedient);
                iesPauCasesnoves.alumnesMatriculats.add(nou);
                System.out.println("Alumne donat d'alta correctament!!");
                
            }
        } while (opcioMenu != 7);






    }

    public void matricularAlumne(Alumne nouAlumne, CicleArrayList cicle) {

        alumnesMatriculats.add(nouAlumne);
        nouAlumne.setCicle(cicle);

    }

    public void llistaAlumnesMatriculats() {
        System.out.println("\nLlistat de Alumnes matriculats a l'institut:");
        int num = 0;
        for (Alumne a : alumnesMatriculats) {
            System.out.println(num + "- " + a.toString());
            num++;
        }
    }

    public void mostrarLlistaCicles() {
        System.out.println("\nLlistat de Cicles de l'institut:");
        int num = 0;
        for (CicleArrayList a : llistatCicles) {
            System.out.println(num + "- " + a.toString());
            num++;
        }
    }
}
