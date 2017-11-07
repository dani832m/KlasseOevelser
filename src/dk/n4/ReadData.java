/* KLASSEØVELSE
Dette simple lille program kan læse indholdet fra en .txt-fil
BEMÆRK: Filen skal laves først, ellers giver det fejl. Kan kreeres med klassen "WriteDataWithAutoClose" */

package dk.n4;

import java.util.Scanner; //Importerer klassen "Scanner"

public class ReadData { //Angiver access modifier og klassens navn

    public static void main(String[] args) throws Exception { //Main-metode, kaster exceptions videre

        // Laver nyt objekt i File-klassen ved navn "file"
        java.io.File file = new java.io.File("scores.txt");

        // Laver nyt scanner-objekt og initialiserer det med vores file-objekt
        Scanner input = new Scanner(file);

        // Læser data fra fil vha. while loop
        while (input.hasNext()) { //Kører så længe, der er indhold i filen
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(
                    firstName + " " + mi + " " + lastName + " " + score);
        }

        // Lukker filen igen (VIGTIGT!!!)
        input.close();

    } //Main lukkes

} //Klassen lukkes