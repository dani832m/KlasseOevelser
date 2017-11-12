/* KLASSEØVELSE
Dette er et lille eksperiment/program med if-statements og while-loops.
Programmet tillader brugeren at gætte et nummer mellem 0 og 100, og meddeler, hvis gættet er for højt eller lavt.
Programmet er meget inspireret af eksemplet i lærebogen, "Intro to Java Programming" */

//Angiver "package" for de involverede klasser
package dk.n4;

//Importerer klassen "Scanner" til senere brug
import java.util.Scanner;

public class GuessNumberWhileLoop { //Klasse inkl. access modifier

    public static void main(String[] args) { //Main-metoden eksekveres

        //Genererer et tilfældigt tal mellem 0 og 100, som skal gættes af brugeren
        int number = (int)(Math.random() * 101); //Variabel "number" deklareret, og initialiseret med "Math.random"

        //Denne linje kan bruges til debugging (Viser det tal, der skal gættes)
        //System.out.println("Tallet, der skal gættes er " + number + " - Din snydepels!");

        //Laver nyt Scanner-objekt med referencen "input"
        Scanner input = new Scanner(System.in);

        //Udskriver informativ besked til konsollen
        System.out.println("Gæt et nummer mellem 0 og 100. Begge tal er inklusiv.");

        //Brugeren kan indtaste sit gæt i konsollen
        System.out.print("\nIndtast dit gæt: ");
        int guess = input.nextInt(); //Initialiserer variablen "guess" med brugerens indtastning

        //If-statement baseret på brugerens gæt
        if (guess == number) //Kører, hvis variablen "guess" er lig med variablen "number"
            System.out.println("Korrekt, tallet er " + number + "! Flot, endda i første forsøg!");
        else if (guess > number)
            System.out.println("Dit gæt er for højt.");
        else
            System.out.println("Dit gæt er for lavt.");

        //While-loop baseret på brugerens gæt. Kører, såfremt brugeren ikke gættede tallet i første forsøg
        while(guess != number) {

            System.out.print("\nPrøv at gætte igen: ");
            guess = input.nextInt();

            if (guess == number) //Kører, hvis variablen "guess" er lig med variablen "number"
                System.out.println("Korrekt, tallet er " + number + "! Bedre sent end aldrig :-)");
            else if (guess > number)
                System.out.println("Dit gæt er for højt.");
            else
                System.out.println("Dit gæt er for lavt.");

        }

    }

}