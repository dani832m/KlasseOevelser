/* KLASSEØVELSE
Simpelt program, der kan beregne arealet af en cirkel ud fra brugerindtastning af radius */

package dk.n4;

import java.util.Scanner; //Importerer "Scanner"

public class ArealBeregner {

    public static void main(String[] args) { //Main-metoden eksekveres

        System.out.print("Indtast cirkels radius: "); //Viser en tekstlinje, hvor brugeren kan indtaste cirkels radius

		/* De næste tre linjer giver brugeren mulighed for indtastning og "scanner den" */
        Scanner input = new Scanner(System.in); //Vi SKAL bruge Scanner-klassen, så vi kan aflæse indtastningen
        double radius = 0; //Ny variabel, der kommer til at indeholde radius, når brugeren indtaster den
        radius = input.nextDouble(); //Indlæser det næste tal, som brugeren indtaster og sætter det til "radius"

        System.out.print("Når radius i cirklen er " + radius + ", "); //Tekst samt brugerindtastet radius udskrives

        double areal = radius * radius * 3.14; //Variabel, der henter indhold fra variablen "radius" og udregner areal

        //Tekststreng der færdiggør beregningen af arealet
        System.out.print("så er arealet " + areal + " - Hverken mere eller mindre.");

    } //Main lukkes

} //Klassen lukkes