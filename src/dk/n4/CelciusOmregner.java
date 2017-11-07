/* KLASSEØVELSE
Simpelt Java-program, der kan konvertere fahrenheit til grader celcius */

package dk.n4; //Package

import java.util.Scanner; //Importerer "Scanner" fra java.util-patch'en

public class CelciusOmregner { //Angiver access modifier og klassens navn

    public static void main(String[] args) { //Starter programmet (Main eksekveres)

        System.out.print("Hej "); //Siger hej (i konsollen)
        String navn = "Fjollerøv."; //Definerer navn
        System.out.println(navn); //Udskriver navnet (i konsollen)

        System.out.print("Indtast grader i fahrenheit, der skal omregnes: "); //Udskriver forklarende tekst
        /* Scanner det næste brugerindtastede data og initialiserer det i variablen "fahrenheit" */
        Scanner input = new Scanner(System.in);
        int fahrenheit = input.nextInt();

        double celcius = (5.0/9) * (fahrenheit-32); //Udregner brugerindtastning til celcius

        //Tekst-streng, der beskriver resultatet af udregningen
        System.out.println(fahrenheit + " grader fahrenheit er " + celcius + " grader celcius.");

    } //Main lukkes

} //Klassen lukkes